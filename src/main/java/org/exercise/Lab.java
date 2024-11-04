package org.exercise;

import java.util.ArrayList;

public class Lab {
    public static void main(String[] args) {

    }

    public static int maxOfTwoNumbers(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static int maxOfThree(int num1, int num2, int num3) {
        int max1 = Math.max(num1, num2);
        int max2 = Math.max(num2, num3);
        return Math.max(max1, max2);
    }

    public static boolean isCharacterAVowel(char letter) {
        boolean result = false;
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (char c : vowels) {
            if (c == letter) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static int argsList(String[] args) {
        return args.length;
    }

    public static String reverseString(String forwardString) {
        StringBuilder reversedString = new StringBuilder();
        for (int i = forwardString.length() - 1; i >= 0; i--) {
            reversedString.append(forwardString.charAt(i));
        }
        return reversedString.toString();
    }

    public static int findLongestWord(String[] words) {
        int longest = 0;
        for (String word: words) {
            if (word.length() > longest) {
                longest = word.length();
            }
        }
        return longest;
    }

    public static String[] filterLongWords(String[] words, int length) {
        ArrayList<String> wordsLongerThanNum = new ArrayList<>();
        for (String word: words) {
            if (word.length() > length) {
                wordsLongerThanNum.add(word);
            }
        }
        String[] newArr = new String[wordsLongerThanNum.size()];
        newArr = wordsLongerThanNum.toArray(newArr);
        return  newArr;
    }
}
