# OddEvenNumberAPI

Dự án Spring Boot kiểm tra số chẵn hay số lẻ.

## Cách chạy dự án

1. Mở terminal tại thư mục này.
2. Chạy lệnh:
   ```bash
   ./mvnw spring-boot:run
   ```
   (Hoặc sử dụng Spring Boot Dashboard trong VS Code)

## API Endpoint

- **URL:** `http://localhost:8080/checknumber`
- **Method:** `GET`
- **Tham số:** `number` (Số nguyên - kiểu int)
- **Ví dụ test:**
   ```bash
   curl "http://localhost:8080/checknumber?number=10"
   ```
   **Kết quả:** `Số 10 là số chẵn`

   ```bash
   curl "http://localhost:8080/checknumber?number=7"
   ```
   **Kết quả:** `Số 7 là số lẻ`
