package OOP.Enums;

public enum Gender {
    FEMALE(1, "f"),
    MALE(2, "m"),
    UNDEFINE(3, "u") {
        public String comment() {
            return "to be decided later: " + getRepr() + ", " + getDescr();
        }
    };

    private int repr;
    private String descr;

    Gender(int repr, String descr) {
        this.repr = repr;
        this.descr = descr;
    }

    public int getRepr() {
        return repr;
    }

    public String getDescr() {
        return descr;
    }

}
