package s06_oop_part1_classes_constructors_inheritance.constructors;

public class BankTest {

    public static void main(String[] args) {
//        BankAccount bobsAccount = new BankAccount();
//        System.out.println(bobsAccount.getBalance());
//        System.out.println(bobsAccount.getNumber());
//        bobsAccount.withdraw(100.0);
//
//        bobsAccount.deposit(50.0);
//        bobsAccount.withdraw(100.0);
//
//        bobsAccount.deposit(51.0);
//        bobsAccount.withdraw(100.0);

        VipCustomer person1 = new VipCustomer();
        System.out.println(person1.getName());

        VipCustomer person2 = new VipCustomer("Pesho", 12000);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Gosho", 500000000, "gosho@gg.com");
        System.out.println(person3.getName());
        System.out.println(person3.getEmail());
    }
}
