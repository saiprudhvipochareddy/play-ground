package javaconcepts.classes;

public class StaticNestedClassExamples {
    int a = 10;
    static int b = 20;

    static class NestedClass {
        public void print() {
            //System.out.println(a+b); this won't work as variable a is not static
            System.out.println(b);
        }
    }
}
