# CircleRestAPI

Dự án Spring Boot tính diện tích hình tròn.

## Cách chạy dự án

1. Mở terminal tại thư mục này.
2. Chạy lệnh:
   ```bash
   ./mvnw spring-boot:run
   ```

## API Endpoint

- **URL:** `http://localhost:8084/circle-area`
- **Method:** `GET`
- **Tham số:** `radius` (Bán kính hình tròn - kiểu double)
- **Ví dụ test:**
  ```bash
  curl "http://localhost:8084/circle-area?radius=5.0"
  ```
