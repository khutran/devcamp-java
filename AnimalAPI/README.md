# AnimalAPI

Dự án Spring Boot REST API minh họa cấu trúc kế thừa: Animal -> Mammal -> Cat/Dog.

## API Endpoints

### 1. Lấy danh sách mèo
- **URL:** `/cats`
- **Method:** `GET`
- **Mô tả:** Trả về danh sách (`ArrayList`) các đối tượng `Cat`.
- **Logic:** Khởi tạo 3 mèo, gọi phương thức `greets()` (in "Meow" ra console).

### 2. Lấy danh sách chó
- **URL:** `/dogs`
- **Method:** `GET`
- **Mô tả:** Trả về danh sách (`ArrayList`) các đối tượng `Dog`.
- **Logic:** 
    - Khởi tạo 3 chó, gọi phương thức `greets()` (in "Woof" ra console).
    - Gọi phương thức `greets(anotherDog)` (in "Woooof" ra console).

## Cấu trúc kế thừa
- `Animal`: Chứa `name`.
- `Mammal`: Kế thừa `Animal`.
- `Cat` & `Dog`: Kế thừa `Mammal`, triển khai phương thức `greets()`.

## Cách chạy
1. Biên dịch và đóng gói:
   ```bash
   mvn clean package
   ```
2. Chạy ứng dụng:
   ```bash
   mvn spring-boot:run
   ```
3. Truy cập: `http://localhost:8080/cats` hoặc `http://localhost:8080/dogs`
