# MusicAPI (56C.80)

Dự án Spring Boot quản lý thông tin âm nhạc (Models), bao gồm cấu trúc phân cấp phức tạp cho Nghệ sĩ, Nhạc sĩ, Thành viên ban nhạc, Album và Ban nhạc.

## API Endpoints (56C.100)
- **GET `/albums`**: Trả về danh sách toàn bộ album từ `AlbumService`.
- **GET `/bands`**: Trả về danh sách các ban nhạc từ `ComposerService`.
- **GET `/artists`**: Trả về danh sách các nghệ sĩ solo từ `ComposerService`.

## Class Hierarchy (56C.80)
- `Person` (firstname, lastname)
  - `Composer` (stagename)
    - `Artist` (List<Album> albums)
    - `BandMember` (instrument)

## Relationship Models
- `Album` (name, List<String> songs)
- `Band` (bandname, List<BandMember> members, List<Album> albums)

## Tính năng nổi bật
- Triển khai đầy đủ kế thừa và các mối quan hệ 1-nhiều phức tạp.
- Sử dụng Java Generics với `List` để quản lý danh sách albums và thành viên.
- Sẵn sàng để mở rộng thành REST API với các services và controllers.
- Đóng gói WAR để triển khai lên máy chủ Tomcat.

## Cách chạy
1. Biên dịch dự án:
   ```bash
   mvn clean package
   ```
2. Dự án được cấu hình là một Spring Boot application có khả năng đóng gói WAR.
