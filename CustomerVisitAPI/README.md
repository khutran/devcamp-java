# CustomerVisitAPI (56C.60)

Dự án Spring Boot REST API quản lý Khách hàng và các chuyến thăm (phiên bản nâng cao 56C.60), hỗ trợ tính toán tổng chi phí và đóng gói WAR.

## API Endpoints

### 1. Lấy danh sách chuyến thăm
- **URL:** `/visits`
- **Method:** `GET`
- **Mô tả:** Trả về danh sách `Visit`, bao gồm thông tin khách hàng, ngày thăm, chi phí dịch vụ, chi phí sản phẩm và tổng chi phí (`totalExpense`).

### 2. Lấy danh sách khách hàng
- **URL:** `/customers`
- **Method:** `GET`
- **Mô tả:** Trả về danh sách `Customer` với thông tin hạng thành viên (nếu có).

## Tính năng nổi bật
- Quản lý thông tin khách hàng với thuộc tính thẻ thành viên (Gold, Silver, etc.).
- Tự động tính toán tổng chi phí cho mỗi lần thăm (`serviceExpense + productExpense`).
- Hỗ trợ đóng gói dạng WAR để deploy lên máy chủ Tomcat.

## Cách chạy
1. Biên dịch và đóng gói thành file WAR:
   ```bash
   mvn clean package
   ```
2. Deploy file `target/customervisit-api-0.0.1-SNAPSHOT.war` lên Tomcat hoặc chạy trực tiếp:
   ```bash
   mvn spring-boot:run
   ```
