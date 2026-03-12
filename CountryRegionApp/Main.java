import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 1. Khởi tạo danh sách Country
        ArrayList<Country> countries = new ArrayList<>();

        // Việt Nam
        Country vn = new Country("VN", "Việt Nam");
        vn.addRegion(new Region("HN", "Hà Nội"));
        vn.addRegion(new Region("HCM", "Hồ Chí Minh"));
        vn.addRegion(new Region("DN", "Đà Nẵng"));
        vn.addRegion(new Region("HP", "Hải Phòng"));
        vn.addRegion(new Region("CT", "Cần Thơ"));

        // Các quốc gia khác
        Country us = new Country("US", "United States");
        Country jp = new Country("JP", "Japan");

        countries.add(vn);
        countries.add(us);
        countries.add(jp);

        // 2. In ra console các country
        System.out.println("--- Danh sách các quốc gia ---");
        for (Country c : countries) {
            System.out.println(c.getCountryName() + " (" + c.getCountryCode() + ")");
        }

        // 3. Duyệt danh sách, nếu là Việt Nam thì in ra các regions
        System.out.println("\n--- Chi tiết các vùng/tỉnh thành của Việt Nam ---");
        for (Country c : countries) {
            if (c.getCountryName().equalsIgnoreCase("Việt Nam")) {
                for (Region r : c.getRegions()) {
                    System.out.println("- " + r.getRegionName() + " (" + r.getRegionCode() + ")");
                }
            }
        }
    }
}
