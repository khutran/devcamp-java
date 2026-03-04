package Task54A60;

public class Date {
    // Các thuộc tính (Fields) - Private
    private int day;
    private int month;
    private int year;

    // Phương thức khởi tạo (Constructor)
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // --- Các phương thức Getter ---
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    // --- Các phương thức Setter ---
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Phương thức set tất cả các giá trị cùng lúc
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Phương thức toString định dạng "dd/mm/yyyy" với số 0 ở trước (leading zero)
    @Override
    public String toString() {
        // Sử dụng String.format để tự động thêm số 0 nếu giá trị < 10
        // %02d: số nguyên có ít nhất 2 chữ số, điền số 0 vào trước nếu thiếu
        // %04d: số nguyên có ít nhất 4 chữ số (cho năm)
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}