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

    /*
    This method asserts if a sentence with 50 letters is a Pangram
     */
    @Test
    public void checkSentenceWith50LettersIsAPangram(){
        assertTrue(ex005.isPangram("The wizard quickly jinxed the gnomes before they vaporized."));
    }

    /*
    This method asserts if a sentence with special characters is a Pangram
     */
    @Test
    public void checkSentenceWithSpecialCharacterIsAPangram(){
        assertTrue(ex005.isPangram("The%wizard_quickly&jinxed£the/gnomes<before>they%vaporized."));
    }

    /*
    This method asserts if a sentence with only numbers is not a Pangram
     */
    @Test
    public void checkSentenceWithOnlyNumbersIsNotAPangram(){
        assertFalse(ex005.isPangram("1234567890"));
    }

    /*
    This method asserts whether a sentence without letter A, a is
    not a pangram
     */
    @Test
    public void checkSentenceWithoutAIsNotAPangram(){
        assertFalse(ex005.isPangram(" quivering Texs zombie fought republic linked jewelry."));
    }

    /*
    This method asserts whether a sentence which is null is not a
    pangram
     */
    @Test
    public void checkSentenceWhichIsNullIsNotAPangram(){
        assertFalse(ex005.isPangram(null));
    }

    /*
    This method asserts if a sentence without space and only letters
    is a pangram
     */
    @Test
    public void checkSentenceWithoutSpaceIsAPangram(){
        assertTrue(ex005.isPangram("Ficklejinxbogdwarvesspymathquiz"));
    }

    /*
    This method asserts if a sentence with uppercase and lowercase
    letters and numbers is a pangram
     */
    @Test
    public void checkSentenceWithUpperLowerAndNumbersIsAPangram(){
        assertTrue(ex005.isPangram("All 1 QUESTION 2 asked BY 3 five 4 watched exPErts amAze the JUDGE."));
    }

}
