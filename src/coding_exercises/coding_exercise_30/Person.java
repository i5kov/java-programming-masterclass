package coding_exercises.coding_exercise_30;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public String getFullName() {
        String fullName;
        if (getFirstName().isEmpty() && getLastName().isEmpty()) {
            fullName = "";
        } else if (getFirstName().isEmpty()) {
            fullName = getLastName();
        } else if (getLastName().isEmpty()) {
            fullName = getFirstName();
        } else {
            fullName = getFirstName() + " " + getLastName();
        }

        return fullName;
    }

    public boolean isTeen() {
        return getAge() > 12 && getAge() < 20;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0;
        } else {
            this.age = age;
        }

    }
}