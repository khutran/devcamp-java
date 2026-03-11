# EmployeeRestAPI

Dự án Spring Boot quản lý danh sách nhân viên.

## Cách chạy dự án

1. Mở terminal tại thư mục này.
2. Chạy lệnh:
   ```bash
   ./mvnw spring-boot:run
   ```

## API Endpoint

- **URL:** `http://localhost:8083/employees`
- **Method:** `GET`
- **Mô tả:** Trả về danh sách JSON gồm 3 nhân viên mặc định.
- **Ví dụ test:**
  ```bash
  curl http://localhost:8083/employees
  ```
