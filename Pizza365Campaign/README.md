# Pizza365Campaign

Dự án này thực hiện các yêu cầu về Daily Pizza Campaign (Mua 1 tặng 1 tùy theo ngày trong tuần).

## API Endpoints

### 1. Simple Campaign
- **URL:** `http://localhost:8080/Pizza365Campaign/devcamp-simple`
- **Method:** `GET`
- **Kết quả trả về:** `test campaign`

### 2. Welcome Campaign (Daily)
- **URL:** `http://localhost:8080/Pizza365Campaign/devcamp-welcome`
- **Method:** `GET`
- **Tham số:** `name` (tùy chọn)
- **Ví dụ:** `http://localhost:8080/Pizza365Campaign/devcamp-welcome?name=John`
- **Cơ chế:** Trả về câu chào kèm theo thông tin khuyến mãi mua 1 tặng 1 dựa trên ngày hiện tại trong tuần (tiếng Việt).

### 3. Lucky Dice
- **URL:** `http://localhost:8080/Pizza365Campaign/lucky-dice`
- **Method:** `GET`
- **Tham số:** `username`, `firstname`, `lastname`
- **Kết quả trả về:** "Xin chào: username, Số may mắn hôm nay của bạn là: [1-6]"

## Giao diện Frontend
Trang `index.html` được triển khai tại `http://localhost:8080/Pizza365Campaign/index.html`. Trang này sẽ tự động gọi API `/devcamp-welcome` và hiển thị lời chào theo ngày.

## Triển khai (Deployment)
1. Đóng gói WAR: `mvn clean package -DskipTests`.
2. Copy file `target/pizza365campaign-0.0.1-SNAPSHOT.war` vào thư mục `webapps/` của Tomcat.
3. Đổi tên thành `Pizza365Campaign.war`.
4. Truy cập qua URL context `/Pizza365Campaign`.
