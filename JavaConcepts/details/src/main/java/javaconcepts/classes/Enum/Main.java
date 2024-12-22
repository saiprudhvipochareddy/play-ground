package javaconcepts.classes.Enum;

public class Main {
    public static void main(String[] args) throws Exception {
        for(NormalEnum normalEnum : NormalEnum.values()) {
            System.out.println(normalEnum.ordinal());
        }
        NormalEnum normalEnum = NormalEnum.valueOf("MONDAY");
        String name = normalEnum.name();

        CustomEnum custom = CustomEnum.getEnumFromValue(3);
        System.out.println(custom.name());

        OverridingEnum overridingEnum = OverridingEnum.valueOf("MONDAY");
        overridingEnum.print();

        OverridingEnum overridingEnumTues = OverridingEnum.TUESDAY;
        overridingEnumTues.print();

        AbstractMethodEnum abstractMethodEnum = AbstractMethodEnum.MONDAY;
        abstractMethodEnum.print();

        String finalName = InterfaceImplEnum.MONDAY.toLowerCase();
        System.out.println(finalName);
    }
}
