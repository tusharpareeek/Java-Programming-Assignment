/**
* Task 5: Longest Substring Without Repeating Characters
* Given a string s, find the length of the longest substring without repeating characters.
* 
* @author Tushar Pareek
* @since  03/09/2024
*/

import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        System.out.println("Longest substring without repeating characters: " + findLongestSubstring(s));
        scan.close();
    }

    public static String findLongestSubstring(String s) {
        int n = s.length();
        int[] lastIndex = new int[256]; // Array to store the last index of each character
        for (int i = 0; i < 256; i++) {
            lastIndex[i] = -1; // Initialize the array with -1
        }

        int maxLength = 0;
        int start = 0;
        int startIndex = 0;

        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);
            if (lastIndex[currentChar] >= start) {
                start = lastIndex[currentChar] + 1;
            }

            lastIndex[currentChar] = end;

            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                startIndex = start;
            }
        }

        return s.substring(startIndex, startIndex + maxLength);
    }
}
