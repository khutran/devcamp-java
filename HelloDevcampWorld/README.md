# HelloDevcampWorld

Dự án này minh họa cách kết nối Frontend (HTML/JS) với Backend (Spring Boot REST API) và cách đóng gói dưới dạng file WAR để triển khai trên các máy chủ Servlet như Tomcat/XAMPP.

## Cấu trúc dự án

- **Backend:** Spring Boot REST API tại `/hello`.
- **Frontend:** Trang web tĩnh tại `src/main/webapp/index.html`.
- **Đóng gói:** WAR (Web Application Archive).

## Cách triển khai (Deployment)

### 1. Đóng gói dự án
Chạy lệnh sau tại thư mục gốc của dự án:
```bash
mvn clean package -DskipTests
```
Sau khi chạy xong, file `hellodevcampworld-0.0.1-SNAPSHOT.war` sẽ được tạo ra trong thư mục `target/`.

### 2. Triển khai lên Tomcat (XAMPP)
1. Copy file `.war` từ thư mục `target/`.
2. Dán vào thư mục `webapps/` của Tomcat (thường trong `C:\xampp\tomcat\webapps` trên Windows hoặc thư mục cài đặt Tomcat trên Mac).
3. Đổi tên file thành `HelloDevcampWorld.war` để có URL đẹp hơn.
4. Khởi động Tomcat từ bảng điều khiển XAMPP hoặc Terminal.

### 3. Kiểm tra ứng dụng
Mở trình duyệt và truy cập:
- API: `http://localhost:8080/HelloDevcampWorld/hello`
- Frontend: `http://localhost:8080/HelloDevcampWorld/index.html`

## Ghi chú
- Dự án này đã được cấu hình `SpringBootServletInitializer` để có thể chạy trên Tomcat bên ngoài.
- `@CrossOrigin` đã được thêm vào Controller để cho phép gọi API từ các domain khác nếu cần.
