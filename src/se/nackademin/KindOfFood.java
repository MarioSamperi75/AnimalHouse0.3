package se.nackademin;

public enum KindOfFood {
    DOG("hundfoder"), CAT("catfoder"), SNAKE("ormpellets");
    public final String foodname;

    KindOfFood (String foodName) {
        this.foodname = foodName;
    }
}
