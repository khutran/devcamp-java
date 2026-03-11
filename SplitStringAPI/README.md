# SplitStringAPI

Dự án Spring Boot thực hiện tách chuỗi đầu vào thành danh sách các từ.

## Cách chạy dự án

1. Mở terminal tại thư mục này.
2. Chạy lệnh:
   ```bash
   ./mvnw spring-boot:run
   ```

## API Endpoint

- **URL:** `http://localhost:8082/split`
- **Method:** `GET`
- **Tham số:** `input` (Chuỗi cần tách)
- **Ví dụ test:**
  ```bash
  curl "http://localhost:8082/split?input=Hello%20Devcamp%20Java"
  ```
