# CustomerInvoiceAPI (56C.40)

Dự án Spring Boot REST API quản lý Khách hàng và Hóa đơn (phiên bản nâng cao 56C.40), hỗ trợ tính toán chiết khấu và đóng gói WAR.

## API Endpoints

### 1. Lấy danh sách hóa đơn
- **URL:** `/invoices`
- **Method:** `GET`
- **Mô tả:** Trả về danh sách `Invoice`, bao gồm thông tin khách hàng và số tiền sau khi đã trừ chiết khấu (`amountAfterDiscount`).

### 2. Lấy danh sách khách hàng
- **URL:** `/customers`
- **Method:** `GET`
- **Mô tả:** Trả về danh sách `Customer` với thông tin chiết khấu của từng người.

## Tính năng nổi bật
- Tự động tính toán số tiền sau chiết khấu dựa trên % discount của khách hàng.
- Định dạng `toString` theo yêu cầu: `name(id)(discount%)`.

## Cách chạy
1. Biên dịch và đóng gói thành file WAR:
   ```bash
   mvn clean package
   ```
2. Deploy file `target/customerinvoice-api-0.0.1-SNAPSHOT.war` lên Tomcat hoặc chạy trực tiếp:
   ```bash
   mvn spring-boot:run
   ```
