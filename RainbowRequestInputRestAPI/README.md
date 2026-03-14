# RainbowRequestInputRestAPI (56D.10)

Dự án Spring Boot đơn giản minh họa cách lấy dữ liệu đầu vào thông qua URI bằng các annotation `@RequestParam` và `@PathVariable`.

## API Endpoints

### 1. Lấy danh sách màu (có bộ lọc Query Param)
- **URL:** `/rainbow-request-query`
- **Method:** `GET`
- **Query Params:** `filter` (String, tuỳ chọn)
- **Mô tả:** Trả về tất cả các màu sắc trong danh sách cầu vồng. Nếu có thuộc tính `filter`, sẽ chỉ trả về những màu có chứa chữ cái trong `filter` (không phân biệt hoa thường).

### 2. Lấy tên màu sắc bằng vị trí (Path Variable)
- **URL:** `/rainbow-request-param/{index}`
- **Method:** `GET`
- **Path Variable:** `index` (int, bắt buộc)
- **Mô tả:** Trả về chuỗi tên màu tại vị trí tương ứng (`index` từ 0 đến 6). Nếu chỉ số nằm ngoài khoảng (nhỏ hơn 0 hoặc lớn hơn 6), kết quả trả về là chuỗi rỗng (`""`).

## Cách chạy dự án

1. Biên dịch dự án và đóng gói `war`:
   ```bash
   mvn clean package
   ```
2. Chạy ứng dụng trực tiếp bằng Spring Boot plugin:
   ```bash
   mvn spring-boot:run
   ```
3. Sau khi chạy, kiểm tra trên trình duyệt hoặc Postman tại cổng `8080`.
