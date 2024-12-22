package javaconcepts.classes.Enum;

public enum AbstractMethodEnum {
    MONDAY {
        @Override
        public void print() {
            System.out.println("Inside Monday");
        }
    },
    TUESDAY {
        @Override
        public void print() {
            System.out.println("inside tuesday");
        }
    };

    public abstract void print();
}
