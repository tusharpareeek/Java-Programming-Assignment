/**
* Task 2: Character Frequency in a String
* Write a Java program that takes a string input and outputs the frequency of each character in a compressed form.
* 
* @author Tushar Pareek
* @since  03/09/2024
*/


import java.util.Scanner;

public class CharacterFrequency {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Ensure the input string is valid
        if (!isValidInput(input)) {
            System.out.println("Invalid input. The string must contain only lowercase English letters.");
            return;
        }

        // Calculate the frequency of each character in the string
        int[] frequencyArray = new int[26]; // Array to hold frequencies of 'a' to 'z'
        calculateFrequencies(input, frequencyArray);

        // Generate and print the compressed form of the character frequencies
        String compressedString = getCompressedString(frequencyArray);
        System.out.println("Compressed form: " + compressedString);
    }

    
    private static boolean isValidInput(String input) {
        for (char c : input.toCharArray()) {
            if (c < 'a' || c > 'z') {
                return false; // Invalid character found
            }
        }
        return true; // All characters are valid
    }

   
    private static void calculateFrequencies(String input, int[] frequencyArray) {
        for (char c : input.toCharArray()) {
            frequencyArray[c - 'a']++; // Increment the frequency for the character
        }
    }

    
    private static String getCompressedString(int[] frequencyArray) {
        String result = ""; // Initialize result string
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] > 0) {
                char currentChar = (char) (i + 'a');
                int count = frequencyArray[i];
                result += currentChar; // Append character to result
                result += count; // Append frequency to result
            }
        }
        return result;
    }
}

