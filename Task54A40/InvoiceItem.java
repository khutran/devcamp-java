package Task54A40;

public class InvoiceItem {
    // 1. Các thuộc tính (Fields) - Private
    private String id; // Mã hóa đơn
    private String desc; // Tên/mô tả sản phẩm
    private int qty; // Số lượng
    private double unitPrice; // Giá 1 sản phẩm

    // 2. Phương thức khởi tạo (Constructor)
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // 3. Các phương thức Getter và Setter
    public String getID() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // 4. Các phương thức bổ sung

    // Tính tổng giá hóa đơn: đơn giá * số lượng
    public double getTotal() {
        return unitPrice * qty;
    }

    // Phương thức toString trả về chuỗi mô tả đúng định dạng yêu cầu
    @Override
    public String toString() {
        return "InvoiceItem[id=" + id + ",desc=" + desc + ",qty=" + qty + ",unitPrice=" + unitPrice + "]";
    }
}