package venuebot.model.enums;

public enum RespondCodes {
    ERROR(100),
    SUCCESS(200)
    ;

    RespondCodes(int code){
        this.code=code;
    }
    private int code;
    public int getCode(){
        return code;
    }
}
