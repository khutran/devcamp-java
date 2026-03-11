# RainbowRestAPI

Dự án Spring Boot cung cấp danh sách màu sắc cầu vồng.

## Cách chạy dự án

1. Mở terminal tại thư mục này.
2. Chạy lệnh:
   ```bash
   ./mvnw spring-boot:run
   ```

## API Endpoint

- **URL:** `http://localhost:8081/rainbow`
- **Method:** `GET`
- **Mô tả:** Trả về danh sách JSON các màu cầu vồng.
- **Ví dụ test:**
  ```bash
  curl http://localhost:8081/rainbow
  ```
