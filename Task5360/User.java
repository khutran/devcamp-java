package Task5360;

public class User {
    // 1. Các thuộc tính (Attributes) - Private
    private String password;
    private String username;
    private boolean enabled;

    // 2. Phương thức khởi tạo không tham số (No-arg constructor)
    public User() {
        this.username = "unknown";
        this.password = "123456";
        this.enabled = false;
    }

    // 3. Phương thức khởi tạo có tham số (Parameterized constructor)
    public User(String username, String password, boolean enabled) {
        this.username = username;
        this.password = password;
        this.enabled = enabled;
    }

    // 4. Getter và Setter cho Password
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // 5. Getter và Setter cho Username
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // 6. Getter và Setter cho Enabled
    public boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    // 7. Ghi đè phương thức toString() để hiển thị thông tin đối tượng (Subtask 3)
    @Override
    public String toString() {
        return "User [username=" + username + ", password=" + password + ", enabled=" + enabled + "]";
    }
}