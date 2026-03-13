# BookAuthorAPI

Dự án Spring Boot REST API quản lý Sách và Tác giả, sử dụng Service để quản lý dữ liệu, hỗ trợ lọc theo số lượng, email và giới tính, hỗ trợ đóng gói WAR để deploy lên Tomcat.

## API Endpoints

### 1. Lấy danh sách sách
- **URL:** `/books`
- **Method:** `GET`
- **Mô tả:** Trả về toàn bộ danh sách `Book`, mỗi cuốn sách kèm theo danh sách `Author`.

### 2. Lọc sách theo số lượng
- **URL:** `/book-quantity?quantityNumber={num}`
- **Method:** `GET`
- **Mô tả:** Trả về danh sách sách có số lượng (`qty`) lớn hơn hoặc bằng `quantityNumber`.

### 3. Lấy thông tin tác giả theo Email
- **URL:** `/author-info?email={email}`
- **Method:** `GET`
- **Mô tả:** Trả về đối tượng `Author` tương ứng với email cung cấp.

### 4. Lọc tác giả theo giới tính
- **URL:** `/author-gender?gender={m|f}`
- **Method:** `GET`
- **Mô tả:** Trả về danh sách tác giả có giới tính tương ứng (`m` cho Nam, `f` cho Nữ).

## Cách chạy
1. Biên dịch và đóng gói thành file WAR:
   ```bash
   mvn clean package
   ```
2. Deploy file `target/bookauthor-api-0.0.1-SNAPSHOT.war` lên Tomcat hoặc chạy trực tiếp:
   ```bash
   mvn spring-boot:run
   ```
3. Truy cập các API qua Postman hoặc trình duyệt.
