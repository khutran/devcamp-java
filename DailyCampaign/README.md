# DailyCampaign (57.10)

Hệ thống cung cấp chương trình khuyến mại hàng ngày (Daily Campaign) cho chuỗi Pizza 365.

## Chức năng
- Tự động xác định thứ trong tuần (Thứ 2 - Chủ nhật).
- Trả về thông điệp khuyến mại tương ứng cho từng ngày.
- Hỗ trợ Cross-Origin (CORS) để frontend có thể gọi API dễ dàng.

## API Endpoints

### 1. Lấy thông tin khuyến mại ngày
- **URL:** `/`
- **Method:** `GET`
- **Mô tả:** Trả về một chuỗi văn bản chứa thông tin khuyến mại.
- **Ví dụ phản hồi:** `"Thứ hai: Mua 1 tặng 1"`

## Cấu trúc khuyến mại
- **MONDAY:** Thứ hai: Mua 1 tặng 1
- **TUESDAY:** Thứ ba: Tặng tất cả khách hàng một phần bánh ngọt
- **WEDNESDAY:** Thứ tư: Giảm giá 50% cho Pizza Hải Sản
- **THURSDAY:** Thứ năm: Miễn phí vận chuyển cho đơn hàng trên 200k
- **FRIDAY:** Thứ sáu: Tặng 1 chai Coca-Cola 1.5L cho combo bự
- **SATURDAY:** Thứ bảy: Giảm 20% cho tất cả các loại Pizza
- **SUNDAY:** Chủ nhật: Mua Pizza size L tặng ngay khoai tây chiên

## Cách build và chạy
1. Build file WAR:
   ```bash
   mvn clean package
   ```
2. Kết quả file `campaigns.war` sẽ nằm trong thư mục `target/`.
3. Khi chạy trên Tomcat, API sẽ khả dụng tại `http://localhost:8080/campaigns/`.
