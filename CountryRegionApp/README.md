# CountryRegionApp

Dự án Java Console minh họa cách quản lý dữ liệu hướng đối tượng với các lớp `Country` và `Region`.

## Cấu trúc lớp
- **Region**: Đại diện cho một vùng miền hoặc tỉnh thành, gồm mã vùng (`regionCode`) và tên vùng (`regionName`).
- **Country**: Đại diện cho một quốc gia, gồm mã quốc gia (`countryCode`), tên quốc gia (`countryName`) và danh sách các vùng miền (`ArrayList<Region>`).

## Tính năng
- Khởi tạo danh sách các quốc gia, bao gồm Việt Nam và các tỉnh thành tiêu biểu.
- In danh sách tất cả các quốc gia ra console.
- Tìm kiếm và in danh sách các tỉnh thành của Việt Nam.

## Cách chạy
1. Mở terminal tại thư mục này.
2. Biên dịch mã nguồn:
   ```bash
   javac Region.java Country.java Main.java
   ```
3. Chạy ứng dụng:
   ```bash
   java Main
   ```
