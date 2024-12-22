package javaconcepts.classes.Enum;

public enum OverridingEnum {
    MONDAY{
        @Override
        public void print() {
            System.out.println("Inside Monday");
        }
    },
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
    public void print() {
        System.out.println("Outside Monday");
    }
}
