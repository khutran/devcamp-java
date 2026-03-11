# InvoiceRestAPI

Dự án Spring Boot quản lý danh sách hóa đơn.

## Cách chạy dự án

1. Mở terminal tại thư mục này.
2. Chạy lệnh:
   ```bash
   ./mvnw spring-boot:run
   ```

## API Endpoint

- **URL:** `http://localhost:8085/invoices`
- **Method:** `GET`
- **Mô tả:** Trả về danh sách JSON các mặt hàng trong hóa đơn.
- **Ví dụ test:**
  ```bash
  curl http://localhost:8085/invoices
  ```
