package com.techreturners.exercise003;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Exercise003Test {

    private Exercise003 ex003;

    @BeforeEach
    public void setup() {
        ex003 = new Exercise003();
    }

    @Test
    public void checkGetIceCreamCodeForMintChocolateChip() {
        String iceCreamFlavour = "Mint Chocolate Chip";
        int expected = 3;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }


    @Test
    public void checkGetIceCreamCodeForMangoSorbet() {
        String iceCreamFlavour = "Mango Sorbet";
        int expected = 5;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    public void checkGetIceCreamCodeForRaspberryRipple() {
        String iceCreamFlavour = "Raspberry Ripple";
        int expected = 1;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    /*
    Added test case if the flavour is not in iceCreamFlavourList
    return iceCreamCode as -1
     */
    public void checkGetIceCreamCodeForBubbleGumBerry() {
        String iceCreamFlavour = "BubbleGum Berry";
        int expected = -1;

        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    /*
    This method checks if iceCreamFlavour is empty a code of -1
    is returned.
     */
    @Test
    public void checkGetIceCreamCodeIsEmpty() {
        int expected = -1;
        assertEquals(expected, ex003.getIceCreamCode(""));
    }

    /*
    This method checks the iceCreamCode is -1 when iceCreamFlavour is
    null
     */
    @Test
    public void checkGetIceCreamCodeWhenIceCreamFlavourISNull() {
        int expected = -1;
        assertEquals(expected, ex003.getIceCreamCode(null));
    }

    /*
    This method asserts the iceCreamCode for Pistachio flavour
     */
    @Test
    public void checkGetIceCreamCodeForPistachio() {
        String iceCreamFlavour = "Pistachio";
        int expected = 0;
        assertEquals(expected, ex003.getIceCreamCode(iceCreamFlavour));
    }

    /*
    This method asserts the iceCreamCode for Vanilla flavour though it
    was entered in all uppercase
     */
    @Test
    public void checkGetIceCreamCodeForVanillaInUpperCase() {
        String iceCreamFlavour = "VANILLA";
        int expected = 2;
        assertEquals(expected,ex003.getIceCreamCode(iceCreamFlavour));
    }

    /*
    This method asserts the iceCreamCode for Chocolate flavour
    though it was entered in all lowercase
     */
    @Test
    public void checkGetIceCreamCodeForChocolateInLowerCase(){
        String iceCreamFlavour = "chocolate";
        int expected = 4;
        assertEquals(expected,ex003.getIceCreamCode(iceCreamFlavour));
    }

    @Test
    public void checkPickMultipleIceCreamFlavours() {

        String[] expected = { "Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet" };

        assertArrayEquals(expected, ex003.iceCreamFlavours());
    }


}
