package s06_oop_part1_classes_constructors_inheritance.constructors;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String email;

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "test@mail.com");
    }

    public VipCustomer() {
        this("Vip Customer", 10000000, "vipCustomer@email.com");
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
