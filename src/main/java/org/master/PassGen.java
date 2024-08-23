package org.master;

import java.util.Random;


public class PassGen {
    String ALPHABET = "AaBbCcDdEeFfGgHhIiJjKkLlMmNnOoPpQqRrSsTtUuVvWwXxYyZz";
    String NUMBER = "012345678901234567890123456789";
    String SYMBOLS = "\"<>?~!@#$%^&*_+{}|:";
    Integer lengthPass = 8;
    String randomText = "";
    String finalText = "";
    String choiceCase;

    Random random = new Random();

    String setRandomText(String randomText, String choice, Integer lengthPass) {
        StringBuilder sb = new StringBuilder();
        //adding symbols and alphabet on one variabel
        if (choice.equalsIgnoreCase("symbols")) {
            ALPHABET += SYMBOLS;
        } else if (choice.equalsIgnoreCase("number")) {
            ALPHABET += NUMBER;
        } else {
            ALPHABET = randomText;
        }
        for (int i = 0; i < lengthPass; i++) {
            // generate random index number
            int index = random.nextInt(ALPHABET.length());
            // get character specified by index
            char randomChar = ALPHABET.charAt(index);
            // append the character to string builder
            sb.append(randomChar);
        }
        randomText = sb.toString();
        return randomText;
    }

    String setAdjustCase(String options, String randomText) {
        try {
            if (options.equalsIgnoreCase("upper")) {
                finalText = randomText.toUpperCase();
            } else if (options.equalsIgnoreCase("lower")) {
                randomText = randomText.toLowerCase();
                finalText = randomText;
            } else {
                finalText = randomText;
                System.out.println("write upper or lower.");
            }
        } catch (NullPointerException e) {
        }
        return finalText;
    }
}