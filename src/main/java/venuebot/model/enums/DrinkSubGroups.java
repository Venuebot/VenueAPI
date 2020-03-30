package venuebot.model.enums;

public enum DrinkSubGroups {
    SOFT("FOOD"),
    BEER("DRINK"),
    WINE("DEALS"),
    COCKTAILS("COCKTAILS"),
    WHISKY("DESSERT");

    private String grp;
    DrinkSubGroups(String grp){this.grp=grp;}
    public String getVal(){return this.grp;}

}
