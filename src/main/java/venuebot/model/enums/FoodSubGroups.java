package venuebot.model.enums;

public enum FoodSubGroups {
    ALL("DEALS"),
    STARTER("STARTER"),
    BREAKFAST("FOOD"),
    LUNCH("DRINK"),
    DINNER("DEALS"),
    CHEFSPECIAL("CHEFSPECIAL"),
    TODAYSDEALS("TODAYSDEALS"),
    DESSERT("DESSERT");

    private String grp;
    FoodSubGroups(String grp){this.grp=grp;}
    public String getVal(){return this.grp;}

}
