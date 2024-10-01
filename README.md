| Thư viện     | Tính năng                | Ưu điểm                                       | Nhược điểm                                 | Khi nào sử dụng |
|--------------|--------------------------|-----------------------------------------------|--------------------------------------------|----------------|
| **Gson**     | Chuyển đổi đối tượng Java & JSON | Dễ sử dụng, linh hoạt, hỗ trợ đối tượng phức tạp | Có thể phức tạp khi chỉ cần thao tác đơn giản | Khi cần chuyển đổi đối tượng Java và JSON dễ dàng |
| **json-simple** | Parse/generate JSON đơn giản  | Rất nhẹ, đơn giản                            | Không hỗ trợ đối tượng phức tạp              | Khi chỉ cần đọc/ghi JSON đơn giản |
| **Jackson**  | Hiệu suất cao, mạnh mẽ      | Rất nhanh, hỗ trợ định dạng khác ngoài JSON   | Cấu hình phức tạp hơn                      | Khi cần hiệu suất cao, hoặc xử lý JSON phức tạp |
| **JSON-B**   | Tích hợp với Java EE        | Tích hợp tốt với Java EE, chuẩn hóa          | Ít phổ biến, tính năng còn hạn chế           | Khi làm việc với Java EE |
| **org.json** | Đơn giản                   | Rất nhẹ và dễ sử dụng                        | Không hỗ trợ chuyển đổi đối tượng Java phức tạp | Khi chỉ cần các tác vụ JSON cơ bản |
 
 # Giới thiệu về Java

Java là một ngôn ngữ lập trình phổ biến và mạnh mẽ, được phát triển bởi Sun Microsystems (hiện nay thuộc Oracle). Java được thiết kế để có thể chạy trên nhiều nền tảng khác nhau, từ máy tính cá nhân đến các hệ thống nhúng.

![](https://th.bing.com/th/id/OIP.2vUTawLyzalDoTv7zF6JTQHaEo?rs=1&pid=ImgDetMain)
## Đặc điểm nổi bật của Java

- **Đa nền tảng**: Java có thể chạy trên nhiều hệ điều hành khác nhau nhờ vào cơ chế `Write Once, Run Anywhere` (WORA).
- **Hướng đối tượng**: Java hỗ trợ lập trình hướng đối tượng, giúp tổ chức mã nguồn một cách rõ ràng và dễ bảo trì.
- **Bảo mật**: Java cung cấp nhiều tính năng bảo mật, từ quản lý bộ nhớ đến kiểm tra quyền truy cập.
- **Hiệu suất cao**: Java sử dụng bộ biên dịch Just-In-Time (JIT) để cải thiện hiệu suất thực thi.

## Cú pháp cơ bản

Dưới đây là một ví dụ về chương trình "Hello, World!" trong Java:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

