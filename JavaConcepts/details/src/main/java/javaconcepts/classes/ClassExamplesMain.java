package javaconcepts.classes;

public class ClassExamplesMain {

    public static void main(String[] args) {
        //Static Nested Class
        StaticNestedClassExamples.NestedClass nestedClass = new StaticNestedClassExamples.NestedClass();
        nestedClass.print();
        new StaticNestedClassExamples.NestedClass().print(); // above and this both are acceptable
    }
}
