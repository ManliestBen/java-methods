package org.exercise;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LabTest {
    @Test
    void testMaxOfTwoNumbers() {
        Assertions.assertEquals(5, Lab.maxOfTwoNumbers(2, 5));
        Assertions.assertEquals(9, Lab.maxOfTwoNumbers(1, 9));
        Assertions.assertEquals(1, Lab.maxOfTwoNumbers(0, 1));
        Assertions.assertEquals(-1, Lab.maxOfTwoNumbers(-1, -4));
    }

    @Test
    void testMaxOfThree() {
        Assertions.assertEquals(100, Lab.maxOfThree(9, 2, 100));
        Assertions.assertEquals(-1, Lab.maxOfThree(-1, -100, -200));
        Assertions.assertEquals(500, Lab.maxOfThree(10, 2, 500));
    }

    @Test
    void testIsCharacterAVowel() {
        Assertions.assertFalse(Lab.isCharacterAVowel('S'));
        Assertions.assertFalse(Lab.isCharacterAVowel('J'));
        Assertions.assertTrue(Lab.isCharacterAVowel('A'));
        Assertions.assertTrue(Lab.isCharacterAVowel('e'));
        Assertions.assertTrue(Lab.isCharacterAVowel('I'));
    }

    @Test
    void testArgsList() {
        Assertions.assertEquals(2, Lab.argsList(new String[]{"Hello", "World"}));
        Assertions.assertEquals(0, Lab.argsList(new String[]{}));
    }

    @Test
    void testReverseString() {
        Assertions.assertEquals("!ytsat era sananaB", Lab.reverseString("Bananas are tasty!"));
        Assertions.assertEquals("laer t'nera sdrib", Lab.reverseString("birds aren't real"));
    }

    @Test
    void testFilterLongWords() {
        Assertions.assertArrayEquals(new String[]{"Second", "LongestHere", "Fourth"}, Lab.filterLongWords(new String[]{"First", "Second", "Third", "LongestHere", "Fourth", "Fifth"}, 5));
        Assertions.assertArrayEquals(new String[]{"Melvin", "Suresh"}, Lab.filterLongWords(new String[]{"Mel", "Melvin", "Suresh"}, 4));
    }

    @Test
    void TestFindLongestWord() {
        Assertions.assertEquals(11, Lab.findLongestWord(new String[]{"First", "Second", "Third", "LongestHere", "Fourth", "Fifth"}));
        Assertions.assertEquals(6, Lab.findLongestWord(new String[]{"Mel", "Melvin", "Suresh"}));
    }
}
