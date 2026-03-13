# ShapeAPI

Dự án Spring Boot REST API tính toán diện tích và chu vi cho các hình học (Circle, Rectangle, Square) dựa trên cấu trúc kế thừa.

## API Endpoints

### 1. Hình tròn (Circle)
- **URL:** `/circle-area?radius={value}`
- **URL:** `/circle-perimeter?radius={value}`

### 2. Hình chữ nhật (Rectangle)
- **URL:** `/rectangle-area?width={value}&height={value}`
- **URL:** `/rectangle-perimeter?width={value}&height={value}`

### 3. Hình vuông (Square)
- **URL:** `/square-area?side={value}`
- **URL:** `/square-perimeter?side={value}`

## Cấu trúc kế thừa
- `Shape`: Lớp cơ sở chứa `color` và `filled`.
- `Circle`: Kế thừa `Shape`, thêm `radius`.
- `Rectangle`: Kế thừa `Shape`, thêm `width` và `length`.
- `Square`: Kế thừa `Rectangle`, đảm bảo `width` và `length` luôn bằng nhau (`side`).

## Cách chạy
1. Biên dịch và đóng gói:
   ```bash
   mvn clean package
   ```
2. Chạy ứng dụng:
   ```bash
   mvn spring-boot:run
   ```
3. Sử dụng Postman hoặc trình duyệt để gọi các API trên.
