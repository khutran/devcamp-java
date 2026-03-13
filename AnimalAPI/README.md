# AnimalAPI (56C.70)

Dự án Spring Boot REST API minh họa kế thừa và đa hình với các loài động vật (Mèo và Chó), hỗ trợ lọc danh sách và đóng gói WAR.

## Hierarchy
`Animal` -> `Mammal` -> `Cat` / `Dog`

## API Endpoints

### 1. Lấy danh sách con mèo
- **URL:** `/cats`
- **Method:** `GET`
- **Mô tả:** Trả về danh sách `Cat` được lọc từ một danh sách chung `Animal` bằng toán tử `instanceof`.

### 2. Lấy danh sách con chó
- **URL:** `/dogs`
- **Method:** `GET`
- **Mô tả:** Trả về danh sách `Dog` được lọc từ một danh sách chung `Animal` bằng toán tử `instanceof`.

## Tính năng nổi bật
- Sử dụng inheritance để quản lý các thuộc tính chung.
- Định dạng `toString` lồng nhau theo cấp bậc kế thừa: `Dog[Mamaml[Animal[name="?"]]]`.
- Phương thức `greets()` riêng biệt cho từng loài.
- Đóng gói WAR để triển khai lên Tomcat.

## Cách chạy
1. Biên dịch và đóng gói thành file WAR:
   ```bash
   mvn clean package
   ```
2. Deploy file `target/animal-api-0.0.1-SNAPSHOT.war` lên Tomcat hoặc chạy trực tiếp:
   ```bash
   mvn spring-boot:run
   ```
