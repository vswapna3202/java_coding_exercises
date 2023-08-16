package com.techreturners.exercise005;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Exercise005Test {

    private Exercise005 ex005;

    @BeforeEach
    public void setup() {
        ex005 = new Exercise005();
    }

    @Test
    public void checkEmptySentenceIsNotAPangram() {
        assertFalse(ex005.isPangram(""));
    }

    @Test
    public void checkPerfectLowerCaseSentenceIsAPangram() {
        assertTrue(ex005.isPangram("abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void checkPerfectUpperCaseSentenceIsAPangram() {
        assertTrue(ex005.isPangram("ABCDEFGHIJKLMNOPQRSTUVWXYZ"));
    }

    @Test
    public void checkSentenceWithLowerCaseIsAPangram() {
        assertTrue(ex005.isPangram("the quick brown fox jumps over the lazy dog"));
    }
    @Test
    public void checkSentenceWithMixedUpperAndLowerCaseIsAPangram() {
        assertTrue(ex005.isPangram("The Five boXing wiZards Jump QuicklY"));
    }
    @Test
    public void checkSentenceWithMissingLetterXIsNotAPangram() {
        assertFalse(ex005.isPangram("the quick brown fo jumps over the lazy dog"));
    }

    @Test
    public void checkSentenceWithMissingLetterHIsNotAPangram() {
        assertFalse(ex005.isPangram("five boxing wizards jump quickly at it"));
    }
    @Test
    public void checkSentenceWithUnderscoresIsAPangram() {
        assertTrue(ex005.isPangram("the_quick_brown_fox_jumps_over_the_lazy_dog"));
    }
    @Test
    public void checkSentenceWithNumbersIsAPangram() {
        assertTrue(ex005.isPangram("the 1 quick brown fox jumps over the 2 lazy dogs"));
    }

    @Test
    public void checkSentenceWith50LettersIsAPangram(){
        assertTrue(ex005.isPangram("The wizard quickly jinxed the gnomes before they vaporized."));
    }

    @Test
    public void checkSentenceWithSpecialCharacterIsAPangram(){
        assertTrue(ex005.isPangram("The%wizard_quickly&jinxed£the/gnomes<before>they%vaporized."));
    }

    @Test
    public void checkSentenceWithOnlyNumbersIsNotAPangram(){
        assertFalse(ex005.isPangram("1234567890"));
    }

    @Test
    public void checkSentenceWithoutAIsNotAPangram(){
        assertFalse(ex005.isPangram(" quivering Texs zombie fought republic linked jewelry."));
    }

    @Test
    public void checkSentenceWhichIsNullIsNotAPangram(){
        assertFalse(ex005.isPangram(null));
    }

    @Test
    public void checkSentenceWithoutSpaceIsAPangram(){
        assertTrue(ex005.isPangram("Ficklejinxbogdwarvesspymathquiz"));
    }

    @Test
    public void checkSentenceWithUpperLowerAndNumbersIsAPangram(){
        assertTrue(ex005.isPangram("All 1 QUESTION 2 asked BY 3 five 4 watched exPErts amAze the JUDGE."));
    }

}
