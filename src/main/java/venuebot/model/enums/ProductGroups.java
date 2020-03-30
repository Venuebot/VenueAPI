package venuebot.model.enums;

public enum ProductGroups {
    FOOD("FOOD"),
    DRINK("DRINK"),
    DESSERT("DESSERT");

    private String grp;
    ProductGroups(String grp){this.grp=grp;}
    public String getVal(){return this.grp;}

}
