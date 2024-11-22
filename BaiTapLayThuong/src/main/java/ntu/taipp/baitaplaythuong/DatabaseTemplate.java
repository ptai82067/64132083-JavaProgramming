package ntu.taipp.baitaplaythuong;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseTemplate <T extends  DBObject>{
  // Phương thức mẫu lưu dữ liệu vào cơ sở dữ liệu
  public final void save(T entity) {
    Connection connection = openConnection();
    insertData(entity,connection);
    closeConnection(connection);
  }
  public final void update(T entity) {
    Connection connection = openConnection();
    updateData(entity,connection);
    closeConnection(connection);
  }
  public final List<T> query(Class<T> clazz) {
    Connection connection = openConnection();
    List<T> list = selectAllData(clazz,connection);
    closeConnection(connection);
    return list;
  }


  protected Connection openConnection() {
    Connection con = null;
    try {
      // Đăng ký driver
      Class.forName("com.mysql.cj.jdbc.Driver");
      // Chuẩn bị chuỗi kết nối
      String connectionURL = "jdbc:mysql://sql12.freesqldatabase.com:3306/sql12745354";
      // Mở kết nối
      con = DriverManager.getConnection(connectionURL, "sql12745354", "AsIIv5Fb4i");
      System.out.println("Connection successful!");
    } catch (ClassNotFoundException e) {
      System.out.println("MySQL Driver not found!");
      e.printStackTrace();
    } catch (SQLException e) {
      System.out.println("Connection failed!");
      e.printStackTrace();
    }
    return con;
  }

  // phuong thuc update dua tre id
  protected void updateData(T entity, Connection connection){
    String tableName = entity.getClass().getSimpleName();
    StringBuilder sql = new StringBuilder("UPDATE " + tableName +" SET ");
    try{

      Field[] fields = getListField((Class<T>) entity.getClass());
      for (int i = 1; i < fields.length; i++) {
        fields[i].setAccessible(true);

          sql.append(fields[i].getName());
        if(fields[i].getType().toString().equalsIgnoreCase("class java.lang.String")){
          sql.append(" = "+"\"" +String.valueOf(fields[i].get(entity))+"\"");
        }else{
          sql.append(" = " +String.valueOf(fields[i].get(entity)));
        }




          // Thêm dấu phẩy nếu không phải trường cuối cùng
          if (i < fields.length - 1) {
            sql.append(", ");


          }
      }
      if (sql.charAt(sql.length() - 2) == ',') {
        sql.delete(sql.length() - 2, sql.length());
      }
      fields[0].setAccessible(true);
      sql.append(" WHERE " + fields[0].getName()+" = ")
              .append(String.valueOf(fields[0].get(entity)));

      System.out.println(sql.toString());

    try (PreparedStatement pstmt = connection.prepareStatement(sql.toString())) {

      // Thực thi câu lệnh SQL
      pstmt.executeUpdate();
      System.out.println("Xửa thành công");
    }

    }
    catch (Exception e) {
      e.printStackTrace();
    }

  }

  private Field[] getListField(Class<T> clazz){
    List<Field> fieldList = new ArrayList<>();
    while (clazz!=null){
      Field[] fields = clazz.getDeclaredFields();

      // Thêm các field của lớp hiện tại vào danh sách
      for (Field field : fields) {
        fieldList.add(0, field); // Thêm vào đầu danh sách để đảo ngược thứ tự
      }

      // Chuyển lên lớp cha trong hệ thống kế thừa
      clazz = (Class<T>) clazz.getSuperclass();
    }
    Field[] allFields = fieldList.toArray(new Field[0]);
    return allFields;
  }




  // Phương thức chèn dữ liệu sử dụng Reflection
  protected void insertData(T entity, Connection connection) {
    String tableName = entity.getClass().getSimpleName();
    StringBuilder sql = new StringBuilder("INSERT INTO " + tableName + " (");
    StringBuilder values = new StringBuilder("VALUES (");

    try {
      Field[] fields = getListField((Class<T>) entity.getClass());
      int fieldCount = 0; // Để đếm số trường không phải là 'id'

      // Xây dựng phần cột của câu SQL
      for (int i = 0; i < fields.length; i++) {
        fields[i].setAccessible(true);
        if (!fields[i].getName().equalsIgnoreCase("id")) { // Bỏ qua trường 'id'
          sql.append(fields[i].getName());
          values.append("?");

          fieldCount++; // Đếm số trường hợp lệ

          // Thêm dấu phẩy nếu không phải trường cuối cùng
          if (i < fields.length - 1) {
            sql.append(", ");
            values.append(", ");
          }
        }
      }

      // Xóa dấu phẩy dư thừa nếu có
      if (sql.charAt(sql.length() - 2) == ',') {
        sql.delete(sql.length() - 2, sql.length());
        values.delete(values.length() - 2, values.length());
      }

      // Kết thúc câu lệnh SQL
      sql.append(") ").append(values).append(")");

      // Tạo PreparedStatement
      try (PreparedStatement pstmt = connection.prepareStatement(sql.toString())) {
        int paramIndex = 1;
        for (Field field : fields) {
          if (!field.getName().equalsIgnoreCase("id")) { // Bỏ qua trường 'id'
            pstmt.setObject(paramIndex++, field.get(entity));
          }
        }

        // Thực thi câu lệnh SQL
        pstmt.executeUpdate();
        System.out.println("Thêm thành công");
      }
    } catch (IllegalAccessException | SQLException e) {
      e.printStackTrace();
    }
  }

  protected List<T> selectAllData(Class<T> clazz, Connection connection) {
    String tableName = clazz.getSimpleName();
    String sql = "SELECT * FROM " + tableName;
    List<T> list = new ArrayList<>();
    try (PreparedStatement pstmt = connection.prepareStatement(sql);
         ResultSet rs = pstmt.executeQuery()) {

      Field[] fields =getListField(clazz);
      while (rs.next()) {
        T entity = clazz.getDeclaredConstructor().newInstance();
        for (Field field : fields) {
          field.setAccessible(true);
          String columnName = field.getName().toLowerCase(); // Chuyển tên trường thành chữ thường
          field.set(entity, rs.getObject(columnName));
        }

        // Xử lý đối tượng entity theo nhu cầu của bạn
        list.add(entity);
      }
    } catch (SQLException | IllegalAccessException | InstantiationException | NoSuchMethodException |
             InvocationTargetException e) {
      e.printStackTrace();
    }
    return list;
  }

  protected void closeConnection(Connection con) {
    if (con != null) {
      try {
        con.close();
        System.out.println("Connection closed!");
      } catch (SQLException e) {
        System.out.println("Failed to close connection!");
        e.printStackTrace();
      }
    }
  }

}
