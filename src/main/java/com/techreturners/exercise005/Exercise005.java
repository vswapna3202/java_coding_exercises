package com.techreturners.exercise005;

public class Exercise005 {

    public boolean isPangram(String inputStr) {
        // If inputStr string is empty or null it is not a pangram
        // so return false
        if((inputStr == null) || (inputStr.isEmpty())){
            return false;
        }
        // Declare a letterPresent boolean list for 26 alphabets
        boolean[] lettersPresent = new boolean[26];

        //Convert the input string to lowercase
        inputStr = inputStr.toLowerCase();

        /* Loop through the input string for each character check
           if it is a letter. If so get the index of the letter
           by subtracting it from 'a'. Set lettersPresent at this
           index as true.
         */
        for(int i=0;i<inputStr.length();i++){
            char c = inputStr.charAt(i);
            if (Character.isLetter(c)){
                int index = inputStr.charAt(i) - 'a';
                lettersPresent[index] = true;
            }
        }

        /* Loop through lettersPresent list if it holds false
           it is not a pangram so return false.
         */
        for(boolean present : lettersPresent){
            if(!present){
                return false;
            }
        }
        /* No false in boolean list which means all alphabets
           were present so return back true
         */
        return true;
    }

}
