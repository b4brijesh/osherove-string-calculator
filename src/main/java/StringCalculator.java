import java.util.ArrayList;
import java.util.StringTokenizer;

public class StringCalculator {
    public int add(String numbers) {

        // set pattern for checking delimiters
        String pattern = ",|\n";

        // check if first line specifies delimiters
        char delimiter;
        if (numbers.length() > 2 &&  numbers.charAt(0) == '/' && numbers.charAt(1) == '/') {
            delimiter = numbers.charAt(2);
            pattern += "|" + delimiter;
            numbers = numbers.substring(4); // since 3rd index char would be newline
        }

        // check if string is empty
        if (numbers.isEmpty()) {
            return 0;
        }

        String[] num = numbers.split(pattern);
        int sum = 0;
        ArrayList<Integer> negatives = new ArrayList<>();
        for (String n: num) {
            int number = Integer.parseInt(n);
            if (number < 0) negatives.add(number);
            else if (number > 1000) continue;
            else sum += number;
        }

        // throw error message if negatives encountered
        if (negatives.size() > 0) {
            String negativeNumbers = negatives.toString();
            throw new IllegalArgumentException("negatives not allowed: " + negativeNumbers);
        }

        return sum;
    }
}
