
import java.util.Scanner;

public class NumberToWords {
    private static final String[] BELOW_TWENTY = {
        "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", 
        "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", 
        "seventeen", "eighteen", "nineteen"
    };
    
    private static final String[] TENS = {
        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };
    
    private static final String HUNDRED = "hundred";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer between 1 and 1000:");
        int number = scanner.nextInt();
        
        if (number < 1 || number > 1000) {
            System.out.println("Number out of range. Please enter a number between 1 and 1000.");
        } else {
            String result = numberToWords(number);
            System.out.println("The number in words is: " + result);
        }
        
        scanner.close();
    }

    public static String numberToWords(int num) {
        if (num == 1000) return "one thousand";

        String words = "";

        if (num >= 100) {
            words += BELOW_TWENTY[num / 100 - 1] + " " + HUNDRED;
            num %= 100;
            if (num > 0) {
                words += " and ";
            }
        }

        if (num >= 20) {
            words += TENS[num / 10] + (num % 10 != 0 ? " " : "");
            num %= 10;
        }

        if (num > 0) {
            words += BELOW_TWENTY[num - 1];
        }

        return words.trim();
    }
}
