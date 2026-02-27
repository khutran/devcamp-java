package Task5330;

import java.util.ArrayList;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Subtask 2: Khởi tạo 4 đối tượng với 4 constructor khác nhau
        Person p1 = new Person();
        Person p2 = new Person("Nguyen Van A");
        Person p3 = new Person("Tran Thi B", 25);
        Person p4 = new Person(101, "Le Van C", 30, 15000000);

        // Thêm vào ArrayList
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);

        // Subtask 3: Sử dụng vòng lặp for để in kết quả
        System.out.println("--- Danh sách Person ---");
        for (Person p : personList) {
            System.out.println(p.toString());
        }

        // Subtask 6: Internationalization (i18n) - Định dạng tiền tệ VN
        System.out.println("\n--- Định dạng tiền tệ (i18n) ---");
        formatCurrency(p4.getSalary());
    }

    // Subtask 6: Hàm định dạng tiền tệ theo Locale Việt Nam
    public static void formatCurrency(double amount) {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String formattedAmount = currencyVN.format(amount);
        System.out.println("Lương định dạng VN: " + formattedAmount);
    }
}