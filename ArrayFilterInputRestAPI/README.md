# ArrayFilterInputRestAPI (56D.40)

Dự án Spring Boot đơn giản minh họa cách lọc mảng số nguyên và lấy giá trị theo vị trí bằng các annotation `@RequestParam` và `@PathVariable`.

## API Endpoints

### 1. Lọc mảng số nguyên (Query Param)
- **URL:** `/array-int-request-query`
- **Method:** `GET`
- **Query Params:** `pos` (int, bắt buộc)
- **Mô tả:** Trả về danh sách (`ArrayList<Integer>`) các số trong mảng lớn hơn giá trị `pos`.
- **Dữ liệu mảng:** `[1, 23, 32, 43, 54, 65, 86, 10, 15, 16, 18]`

### 2. Lấy giá trị theo vị trí (Path Variable)
- **URL:** `/array-int-param/{index}`
- **Method:** `GET`
- **Path Variable:** `index` (int, bắt buộc)
- **Mô tả:** Trả về số tại vị trí `index` trong mảng. Nếu `index < 0` hoặc `index >= 11`, trả về chuỗi rỗng `""`.

## Cách chạy dự án

1. Biên dịch dự án và đóng gói `war`:
   ```bash
   mvn clean package
   ```
2. Chạy ứng dụng:
   ```bash
   mvn spring-boot:run
   ```
3. Sau khi chạy, kiểm tra tại cổng `8080`.
