package BookAuthorClass;

// File: Main.java
public class Main {
    public static void main(String[] args) {
        // --- subTask 4: Khởi tạo và in thông tin Tác giả ---
        Author author1 = new Author("Nguyen Van A", "nva@gmail.com", 'm');
        Author author2 = new Author("Tran Thi B", "ttb@gmail.com", 'f');

        System.out.println("--- Thong tin Tac gia ---");
        System.out.println(author1.toString());
        System.out.println(author2.toString());
        System.out.println();

        // --- subTask 5: Khởi tạo và in thông tin Sách ---
        // book1: dùng author1, không truyền qty (mặc định sẽ là 0)
        Book book1 = new Book("Lap trinh Java co ban", author1, 150000.0);

        // book2: dùng author2, có truyền qty là 50
        Book book2 = new Book("Cau truc du lieu va giai thuat", author2, 200000.0, 50);

        System.out.println("--- Thong tin Sach ---");
        System.out.println(book1.toString());
        System.out.println(book2.toString());
    }
}