# ArtistAlbumAPI

Dự án Spring Boot REST API quản lý Nghệ sĩ và Album, sử dụng Service để quản lý dữ liệu và hỗ trợ đóng gói WAR để deploy lên Tomcat.

## API Endpoints

### 1. Lấy danh sách nghệ sĩ
- **URL:** `/artists`
- **Method:** `GET`
- **Mô tả:** Trả về toàn bộ danh sách `Artist`, mỗi nghệ sĩ kèm theo danh sách `Album`.

### 2. Lấy thông tin nghệ sĩ theo ID
- **URL:** `/artist-info?artistId={id}`
- **Method:** `GET`
- **Mô tả:** Trả về đối tượng `Artist` tương ứng với `artistId` (ví dụ: 1, 2, 3).

### 3. Lấy thông tin album theo ID
- **URL:** `/album-info?albumId={id}`
- **Method:** `GET`
- **Mô tả:** Trả về đối tượng `Album` tương ứng với `albumId` (ví dụ: 101, 201, 301).

## Cách chạy
1. Biên dịch và đóng gói thành file WAR:
   ```bash
   mvn clean package
   ```
2. Deploy file `target/artistalbum-api-0.0.1-SNAPSHOT.war` lên Tomcat hoặc chạy trực tiếp:
   ```bash
   mvn spring-boot:run
   ```
3. Truy cập các API qua Postman hoặc trình duyệt.
