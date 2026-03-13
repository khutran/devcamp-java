# CircleCylinderAPI

Dự án Spring Boot REST API cung cấp các công cụ tính toán hình học cơ bản.

## API Endpoints

### 1. Tính diện tích hình tròn
- **URL:** `/circle-area`
- **Method:** `GET`
- **Tham số:** `radius` (double)
- **Ví dụ:** `GET http://localhost:8080/circle-area?radius=5.0`
- **Mã nguồn:** [Circle.java](./src/main/java/com/devcamp/circlecylinder/model/Circle.java) sử dụng `Math.PI * radius * radius`.

### 2. Tính thể tích hình trụ
- **URL:** `/cylinder-volume`
- **Method:** `GET`
- **Tham số:** `radius` (double), `height` (double)
- **Ví dụ:** `GET http://localhost:8080/cylinder-volume?radius=5.0&height=10.0`
- **Mã nguồn:** [Cylinder.java](./src/main/java/com/devcamp/circlecylinder/model/Cylinder.java) kế thừa từ `Circle` và sử dụng `getArea() * height`.

## Cách chạy
1. Biên dịch và đóng gói:
   ```bash
   mvn clean package
   ```
2. Chạy ứng dụng:
   ```bash
   mvn spring-boot:run
   ```
