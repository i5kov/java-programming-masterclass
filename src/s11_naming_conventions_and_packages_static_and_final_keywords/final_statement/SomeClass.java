package s11_naming_conventions_and_packages_static_and_final_keywords.final_statement;

public class SomeClass {

    private static int classCounter = 0;
    public final int instanceNumber;
    private final String name;


    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter;
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
