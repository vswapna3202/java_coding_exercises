package com.techreturners.exercise001;

import java.text.DecimalFormat;
import java.util.List;

public class Exercise001 {
    /*
        Get first character from string word and convert it to uppercase,
        using Character.toUpperCase(). substring the string from index
        position 1 so every letter except the first is in inputSubString.
        Concatenate capitaliseFirstChar and inputSubString and return.
    */
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    /*
    Get first char of firstName and lastName which are the initials.
    Concatenate firstInitial . and lastInitial and return
     */
    public String generateInitials(String firstName, String lastName) {
        return firstName.charAt(0)+"."+lastName.charAt(0);
    }

    /*
    Calculate originalPrice + percentage of original price as per vatRate
    store this in tempResult. Format tempResult to hold 2 digits after decimal
    point. Convert back to double and return
     */
    public double addVat(double originalPrice, double vatRate) {
        double tempResult = originalPrice + (originalPrice * vatRate)/100;
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return Double.parseDouble(decimalFormat.format(tempResult));
    }

    /*
    Declare a StringBuilder object by passing sentence to its constructor.
    Call reverse() method and convert back to String and return
     */
    public String reverse(String sentence) {
        return new StringBuilder(sentence).reverse().toString();
    }

    /*
    Uses lambda function to stream users list of User object. Uses filter
    method and checks if user.getType() is Linux if so the count() method
    is called to get count of all users who have type Linux. Cast to int
    needed as count returns long
     */
    public int countLinuxUsers(List<User> users) {
         return (int) users.stream()
                 .filter(user -> user.getType().equals("Linux"))
                 .count();
    }
}
