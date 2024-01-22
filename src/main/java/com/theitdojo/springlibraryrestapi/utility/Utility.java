package com.theitdojo.springlibraryrestapi.utility;


import java.util.Random;

public class Utility {
    public static String generateRandomString(int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("Size must be a positive integer");
        }

        // Define the characters from which the random string will be generated
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        // Create a StringBuilder to build the random string
        StringBuilder randomString = new StringBuilder(size);

        // Create a Random object to generate random indices
        Random random = new Random();

        // Build the random string by appending random characters
        for (int i = 0; i < size; i++) {
            int randomIndex = random.nextInt(characters.length());
            char randomChar = characters.charAt(randomIndex);
            randomString.append(randomChar);
        }

        // Convert StringBuilder to String and return
        return randomString.toString();
    }

}
