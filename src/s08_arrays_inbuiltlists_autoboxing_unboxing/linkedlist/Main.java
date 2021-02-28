package s08_arrays_inbuiltlists_autoboxing_unboxing.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("Pesho", 54.96);
        Customer anotherCustomer;
        anotherCustomer = customer;
        anotherCustomer.setBalance(12.18);

        System.out.printf("Balance for customer %s is %.2f%n", customer.getName(), customer.getBalance());

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(3);
        intList.add(4);

        printListElements(intList);

        int indexPosition = 1;
        intList.add(indexPosition, 2);
        printListElements(intList);
    }

    static void printListElements(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ": " + list.get(i));
        }
    }
}
