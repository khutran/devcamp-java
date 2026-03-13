# CountryRegionAPI

Dự án Spring Boot REST API quản lý Quốc gia và Vùng miền, sử dụng Service để quản lý dữ liệu và hỗ trợ đóng gói WAR để deploy lên Tomcat.

## API Endpoints

### 1. Lấy danh sách quốc gia
- **URL:** `/countries`
- **Method:** `GET`
- **Mô tả:** Trả về toàn bộ danh sách `Country`, mỗi quốc gia kèm theo danh sách `Region`.

### 2. Lấy thông tin quốc gia theo mã
- **URL:** `/country-info?countryCode={code}`
- **Method:** `GET`
- **Mô tả:** Trả về đối tượng `Country` tương ứng với `countryCode` (ví dụ: VN, UK, JP).

### 3. Lấy thông tin vùng miền theo mã
- **URL:** `/region-info?regionCode={code}`
- **Method:** `GET`
- **Mô tả:** Trả về đối tượng `Region` tương ứng với `regionCode` (ví dụ: HN, HCM, LD, TK).

## Cách chạy
1. Biên dịch và đóng gói thành file WAR:
   ```bash
   mvn clean package
   ```
2. Deploy file `target/countryregion-api-0.0.1-SNAPSHOT.war` lên Tomcat hoặc chạy trực tiếp:
   ```bash
   mvn spring-boot:run
   ```
3. Truy cập các API qua Postman hoặc trình duyệt.
