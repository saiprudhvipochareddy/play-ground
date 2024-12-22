package javaconcepts.classes.Enum;

public enum CustomEnum {
    MONDAY(1, "1st day of week"),
    TUESDAY(2, "2nd day of week"),
    WEDNESDAY(3, "1st day of week");

    private final int val;
    private final String comment;

    CustomEnum(int val, String comments) {
        this.val = val;
        this.comment = comments;
    }

    public int getVal() {
        return val;
    }

    public String getComment() {
        return comment;
    }

    public static CustomEnum getEnumFromValue(int value) throws Exception {
        for(CustomEnum customEnum: CustomEnum.values()) {
            if (value == customEnum.val) {
                return customEnum;
            }
        }
        throw new Exception("Enum not found");
    }
}
