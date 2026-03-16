# Daily Campaign API

## Mô tả
API cung cấp thông tin khuyến mại pizza theo ngày trong tuần. Được tích hợp trực tiếp với giao diện Pizza365.

## Cổng chạy
- Port: `8088`
- Context Path: `/campaigns`

## API Endpoints
- `GET /campaigns/`: Trả về chuỗi thông báo khuyến mại tương ứng với ngày hiện tại.

## Tích hợp Frontend
- File giao diện: `src/main/webapp/index.html`
- Chạy giao diện tại: `http://localhost:8088/campaigns/index.html` (khi server đang chạy).

## Cách chạy
```bash
mvn spring-boot:run
```
