# CustomerAccountAPI (56C.50)

Dự án Spring Boot REST API quản lý Khách hàng và Tài khoản ngân hàng (phiên bản nâng cao 56C.50), hỗ trợ quản lý số dư (nạp/rút) và đóng gói WAR.

## API Endpoints

### 1. Lấy danh sách tài khoản
- **URL:** `/accounts`
- **Method:** `GET`
- **Mô tả:** Trả về danh sách `Account`, mỗi tài khoản bao gồm thông tin khách hàng và số dư hiện tại.

### 2. Lấy danh sách khách hàng
- **URL:** `/customers`
- **Method:** `GET`
- **Mô tả:** Trả về danh sách `Customer` với thông tin chiết khấu của từng người.

## Tính năng nổi bật
- Quản lý số dư tài khoản với các phương thức `deposit` (nạp tiền) và `withdraw` (rút tiền).
- Kiểm tra số dư khi rút tiền: thông báo lỗi khi số tiền rút vượt quá số dư hiện có.
- Định dạng hiển thị chuyên nghiệp: Số dư được làm tròn tới 2 chữ số thập phân.
- Định dạng `toString` khách hàng: `name(id)(discount%)`.

## Cách chạy
1. Biên dịch và đóng gói thành file WAR:
   ```bash
   mvn clean package
   ```
2. Deploy file `target/customeraccount-api-0.0.1-SNAPSHOT.war` lên Tomcat hoặc chạy trực tiếp:
   ```bash
   mvn spring-boot:run
   ```
