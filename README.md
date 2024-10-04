# Dự án RSS và XML với Java

## Mô tả dự án
Dự án này minh họa cách sử dụng thư viện ROME để tạo và đọc dữ liệu từ một RSS feed bằng XML trong Java. Chúng ta sẽ sử dụng định dạng RSS 2.0 để cung cấp các bài viết mới nhất từ một trang web dưới dạng file XML.

## Khái niệm cơ bản

### RSS là gì?
**RSS** (Really Simple Syndication) là một định dạng file XML giúp tự động cập nhật và cung cấp nội dung từ các trang web, đặc biệt là các trang có nội dung thay đổi thường xuyên như tin tức hoặc blog. RSS cho phép người dùng dễ dàng theo dõi các bài viết hoặc tin tức mới mà không cần phải truy cập vào từng trang web cụ thể.

### XML là gì?
**XML** (eXtensible Markup Language) là một ngôn ngữ dùng để lưu trữ và truyền tải dữ liệu dưới dạng có cấu trúc. XML sử dụng các thẻ (tags) để tổ chức dữ liệu theo kiểu phân cấp, giúp dữ liệu dễ đọc và dễ xử lý bởi máy tính. Nó đóng vai trò quan trọng trong việc định dạng và trao đổi thông tin giữa các hệ thống.

## Cách sử dụng
### Tạo RSS feed:
Dự án này bao gồm mã ví dụ về cách tạo một RSS feed mới và lưu nó vào file XML.

### Đọc RSS feed:
Mã ví dụ cũng bao gồm cách đọc một RSS feed từ file XML, phân tích và hiển thị các bài viết có trong đó.

## Thư viện sử dụng
- **ROME**: Thư viện Java để tạo, đọc và xử lý RSS feed và Atom.

## Hướng dẫn cài đặt
1. Cài đặt thư viện ROME:
    Nếu sử dụng Maven, thêm phụ thuộc sau vào `pom.xml`:
    ```xml
    <dependency>
        <groupId>rome</groupId>
        <artifactId>rome</artifactId>
        <version>1.15.0</version>
    </dependency>
    ```


# Giới thiệu về JSON

***JSON (JavaScript Object Notation) là một định dạng nhẹ để trao đổi dữ liệu, dễ đọc và viết cho con người cũng như dễ phân tích và sinh ra cho máy móc. Trong Java, JSON thường được sử dụng để chuyển đổi giữa dữ liệu dạng JSON và các đối tượng Java.***

### So sánh tổng quát giữa các thư viện JSON

| Thư viện     | Tính năng                | Ưu điểm                                       | Nhược điểm                                 | Khi nào sử dụng |
|--------------|--------------------------|-----------------------------------------------|--------------------------------------------|----------------|
| **Gson**     | Chuyển đổi đối tượng Java & JSON | Dễ sử dụng, linh hoạt, hỗ trợ đối tượng phức tạp | Có thể phức tạp khi chỉ cần thao tác đơn giản | Khi cần chuyển đổi đối tượng Java và JSON dễ dàng |
| **json-simple** | Parse/generate JSON đơn giản  | Rất nhẹ, đơn giản                            | Không hỗ trợ đối tượng phức tạp              | Khi chỉ cần đọc/ghi JSON đơn giản |
| **Jackson**  | Hiệu suất cao, mạnh mẽ      | Rất nhanh, hỗ trợ định dạng khác ngoài JSON   | Cấu hình phức tạp hơn                      | Khi cần hiệu suất cao, hoặc xử lý JSON phức tạp |
| **JSON-B**   | Tích hợp với Java EE        | Tích hợp tốt với Java EE, chuẩn hóa          | Ít phổ biến, tính năng còn hạn chế           | Khi làm việc với Java EE |
| **org.json** | Đơn giản                   | Rất nhẹ và dễ sử dụng                        | Không hỗ trợ chuyển đổi đối tượng Java phức tạp | Khi chỉ cần các tác vụ JSON cơ bản |


### Các Dependencies để làm việc với JSON trong Maven

Để làm việc với Json trong Maven, bạn có thể thêm các dependencies ở dưới vào trong file `pom.xml`:

#### 1. Gson
```xml
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.9.0</version> <!-- Latest version -->
</dependency>
```
#### 2. json-simple
```xml
<dependency>
        <groupId>com.googlecode.json-simple</groupId>
        <artifactId>json-simple</artifactId>
        <version>1.1.1</version>
</dependency>
```
#### 3. Jackson Databind
```xml
<dependency>
        <groupId>com.fasterxml.jackson.core</groupId>
        <artifactId>jackson-databind</artifactId>
        <version>2.15.0</version>
</dependency>
```
#### 4. JSON-B
```xml
<dependency>
        <groupId>jakarta.json.bind</groupId>
        <artifactId>jakarta.json.bind-api</artifactId>
        <version>2.0.0</version>
</dependency>
```
#### 5. org.json
```xml
<dependency>
        <groupId>org.json</groupId>
        <artifactId>json</artifactId>
        <version>20220320</version>
</dependency>
```
