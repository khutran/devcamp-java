# AccountRestAPI

Dự án Spring Boot quản lý danh sách tài khoản ngân hàng.

## Cách chạy dự án

1. Mở terminal tại thư mục này.
2. Chạy lệnh:
   ```bash
   ./mvnw spring-boot:run
   ```

## API Endpoint

- **URL:** `http://localhost:8086/accounts`
- **Method:** `GET`
- **Mô tả:** Trả về danh sách JSON các tài khoản.
- **Ví dụ test:**
  ```bash
  curl http://localhost:8086/accounts
  ```
