package br.com.edson.controlealunos.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GraduationTest {

    @Test
    void valueOf() {
        assertEquals(Graduation.WHITE_BELT, Graduation.valueOf(1));
        assertEquals(Graduation.GREY_AND_WHITE_BELT, Graduation.valueOf(2));
        assertEquals(Graduation.GREY_BELT, Graduation.valueOf(3));
        assertEquals(Graduation.GREY_AND_BLACK_BELT, Graduation.valueOf(4));
        assertEquals(Graduation.YELLOW_AND_WHITE_BELT, Graduation.valueOf(5));
        assertEquals(Graduation.YELLOW_BELT, Graduation.valueOf(6));
        assertEquals(Graduation.YELLOW_AND_BLACK_BELT, Graduation.valueOf(7));
        assertEquals(Graduation.ORANGE_AND_WHITE_BELT, Graduation.valueOf(8));
        assertEquals(Graduation.ORANGE_BELT, Graduation.valueOf(9));
        assertEquals(Graduation.ORANGE_AND_BLACK_BELT, Graduation.valueOf(10));
        assertEquals(Graduation.GREEN_AND_WHITE_BELT, Graduation.valueOf(11));
        assertEquals(Graduation.GREEN_BELT, Graduation.valueOf(12));
        assertEquals(Graduation.GREEN_AND_BLACK_BELT, Graduation.valueOf(13));
        assertEquals(Graduation.BLUE_BELT, Graduation.valueOf(14));
        assertEquals(Graduation.PURPLE_BELT, Graduation.valueOf(15));
        assertEquals(Graduation.BROWN_BELT, Graduation.valueOf(16));
        assertEquals(Graduation.BLACK_BELT, Graduation.valueOf(17));
        assertEquals(Graduation.RED_AND_BLACK_BELT, Graduation.valueOf(18));
        assertEquals(Graduation.RED_AND_WHITE_BELT, Graduation.valueOf(19));
        assertEquals(Graduation.RED_BELT, Graduation.valueOf(20));
    }
}