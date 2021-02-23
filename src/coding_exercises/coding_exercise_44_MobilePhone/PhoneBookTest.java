package coding_exercises.coding_exercise_44_MobilePhone;

public class PhoneBookTest {

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("123456");
        mobilePhone.addNewContact(Contact.createContact("Ivan", "08888888"));
        mobilePhone.addNewContact(Contact.createContact("Ivan", "08888888"));
    }
}
