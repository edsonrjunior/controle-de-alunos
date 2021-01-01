package br.com.edson.controlealunos.enums;

public enum Graduation {

    WHITE_BELT(1),
    GREY_AND_WHITE_BELT(2),
    GREY_BELT(3),
    GREY_AND_BLACK_BELT(4),
    YELLOW_AND_WHITE_BELT(5),
    YELLOW_BELT(6),
    YELLOW_AND_BLACK_BELT(7),
    ORANGE_AND_WHITE_BELT(8),
    ORANGE_BELT(9),
    ORANGE_AND_BLACK_BELT(10),
    GREEN_AND_WHITE_BELT(11),
    GREEN_BELT(12),
    GREEN_AND_BLACK_BELT(13),
    BLUE_BELT(14),
    PURPLE_BELT(15),
    BROWN_BELT(16),
    BLACK_BELT(17),
    RED_AND_BLACK_BELT(18),
    RED_AND_WHITE_BELT(19),
    RED_BELT(20);

    private int code;

    private Graduation (int code){
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public static Graduation valueOf(int code){
        for (Graduation value : Graduation.values()){
            if(value.getCode() == code){
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid graduation code " + code);
    }
}
