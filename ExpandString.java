/**
* Task 1: Expand Characters in a String
* Given a string containing characters followed by digits, expand each character by repeating it according to the 
* digit that follows.
* 
* @author Tushar Pareek
* @since  03/09/2024
*/

import java.util.Scanner;

public class ExpandString {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        
        scanner.close();

        
        String expandedString = expandCharacters(input);

        System.out.println("Expanded form: " + expandedString);
    }

   
    private static String expandCharacters(String input) {
        String result = ""; 
        int length = input.length(); 

        // Traversing the input string 
        for (int i = 0; i < length; i++) {
            char currentChar = input.charAt(i);
            
            
            if (Character.isLetter(currentChar)) {
                char charToRepeat = currentChar;
                int repeatCount = 0;
                
               
                i++;
                while (i < length && Character.isDigit(input.charAt(i))) {
                    repeatCount = repeatCount * 10 + (input.charAt(i) - '0');
                    i++;
                }
                i--; 
                for (int j = 0; j < repeatCount; j++) {
                    result += charToRepeat;
                }
            }
        }
        return result;
    }
}
