package Task54B70;

// File: Customer.java
public class Customer {
    private String name;
    private boolean member = false; // Mặc định là false
    private String memberType;

    // Constructor chỉ nhận name theo UML
    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public void setMember(boolean member) {
        this.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String type) {
        this.memberType = type;
    }

    @Override
    public String toString() {
        return "Customer[name=" + name + ", member=" + member +
                ", memberType=" + (memberType != null ? memberType : "None") + "]";
    }
}