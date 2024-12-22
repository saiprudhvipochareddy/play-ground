package javaconcepts.classes.Generics;

public class GenericMethods {
    public <T> void printSomething(T value) {
        System.out.println(value);
    }

    /*
    upper bound
     */
    public <T extends Number> void printSomethingNumber(T value) {
        System.out.println(value);
    }

    public static void main(String[] args) {
        GenericMethods genericMethods = new GenericMethods();
        genericMethods.printSomething("String");
        genericMethods.printSomething(1+2);

        genericMethods.printSomethingNumber(1.0);
        genericMethods.printSomethingNumber(1);

    }
}
