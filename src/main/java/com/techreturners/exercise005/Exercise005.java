package com.techreturners.exercise005;

public class Exercise005 {

    public boolean isPangram(String inputStr) {

        // If inputStr string is empty or null it is not a pangram
        if((inputStr == null) || (inputStr.isEmpty())){
            return false;
        }

        boolean[] lettersPresent = new boolean[26];
        inputStr = inputStr.toLowerCase();

        /* Loop through the input string for each character check
           if it is a letter. If so get the index of the letter
           by subtracting it from 'a'. Set lettersPresent at this
           index as true.
         */
        for (char currentChar : inputStr.toCharArray()){
            if (Character.isLetter(currentChar)){
                lettersPresent[currentChar - 'a'] = true;
            }
        }
        for(boolean present : lettersPresent){
            if(!present){
                return false;
            }
        }
        return true;
    }

}
