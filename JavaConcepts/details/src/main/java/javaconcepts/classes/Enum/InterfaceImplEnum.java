package javaconcepts.classes.Enum;

public enum InterfaceImplEnum implements MyInterface{
    MONDAY,
    TUESDAY;

    @Override
    public String toLowerCase() {
        return this.name().toLowerCase();
    }
}
