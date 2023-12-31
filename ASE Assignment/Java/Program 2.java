import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = scanner.nextLine();
        int result = romanToInt(romanNumeral);
        if (result != -1) {
            System.out.println("The integer equivalent is: " + result);
        } else {
            System.out.println("Invalid Roman numeral. Please enter a valid Roman numeral.");
        }
    }

    public static int romanToInt(String s) {
        // Create a map to store the values of Roman numerals
        Map<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int result = 0;
        int prevValue = 0; // To keep track of the previous value

        // Iterate through the Roman numeral string from right to left
        for (int i = s.length() - 1; i >= 0; i--) {
            char currentRoman = s.charAt(i);
            Integer currentValue = romanValues.get(currentRoman);

            if (currentValue == null) {
                return -1; // Invalid Roman numeral
            }

            // Check for subtractive notation (e.g., IV, IX, XL, XC, CD, CM)
            if (currentValue < prevValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }

            // Update the previous value for the next iteration
            prevValue = currentValue;
        }

        return result;
    }
}


   
