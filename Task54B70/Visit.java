package Task54B70;

// File: Visit.java
import java.util.Date;

public class Visit {
    private Customer customer;
    private Date date;
    private double serviceExpense;
    private double productExpense;

    // Constructor nhận name và date theo UML
    // Để liên kết với đối tượng Customer có sẵn, ta khởi tạo mới hoặc gán lại
    public Visit(String name, Date date) {
        this.customer = new Customer(name);
        this.date = date;
    }

    // Phương thức bổ sung để gán một đối tượng Customer cụ thể (để đáp ứng subTask
    // 5)
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double ex) {
        this.serviceExpense = ex;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double ex) {
        this.productExpense = ex;
    }

    // Tính tổng chi phí: Total Expense = Service Expense + Product Expense
    public double getTotalExpense() {
        return serviceExpense + productExpense;
    }

    @Override
    public String toString() {
        return "Visit[customer=" + customer.toString() + ", date=" + date +
                ", serviceExpense=" + serviceExpense + ", productExpense=" + productExpense + "]";
    }
}