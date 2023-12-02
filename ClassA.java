// ClassA.java
public class ClassA {
    public static void main(String[] args) {
        // Create an instance of ClassB
        ClassB bInstance = new ClassB();

        // Call a method in ClassB
        bInstance.methodInClassB();

        // Access a field in ClassB
        System.out.println("Value from ClassB: " + bInstance.fieldInClassB);
    }
}

