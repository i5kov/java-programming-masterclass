package s06_oop_part1_classes_constructors_inheritance.constructors;

public class BankAccount {

    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public BankAccount() {
        this("56789", 2.50, "Default Name", "Default Email", "Default Phone");
        System.out.println("Empty constructor called!");
    }

    public BankAccount(String number, double balance, String customerName, String customerEmail, String customerPhoneNumber) {
        System.out.println("Constructor with parameters called!");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public BankAccount(String customerName, String customerEmail, String customerPhoneNumber) {
        this("99999", 100.55, customerName, customerEmail, customerPhoneNumber);
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double moneyForDeposit) {
        if (moneyForDeposit > 0) {
            this.balance += moneyForDeposit;
        }
    }

    public void withdraw(double withdrawAmount) {
        if (getBalance() - withdrawAmount < 0) {
            System.out.printf("Only $%.2f available. Withdraw not processed%n", getBalance());
        } else {
            this.balance -= withdrawAmount;
            System.out.printf("Withdraw of $%.2f processed. Remaining balance: $%.2f%n", withdrawAmount, getBalance());
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
