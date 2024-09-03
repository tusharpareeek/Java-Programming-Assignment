
public class CharacterFrequencyCompressor {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Enter a string of lowercase English letters:");
        String input = scanner.nextLine();
        scanner.close();
        
        String compressed = compressString(input);
        System.out.println("Compressed string: " + compressed);
    }

    public static String compressString(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        
        StringBuilder result = new StringBuilder();
        int n = s.length();
        int count = 1;  // Initialize count to 1 for the first character
        
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                result.append(s.charAt(i - 1)).append(count);
                count = 1;  // Reset count for the new character
            }
        }
        
        // Append the last character and its count
        result.append(s.charAt(n - 1)).append(count);
        
        return result.toString();
    }
}
