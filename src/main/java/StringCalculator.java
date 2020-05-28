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
        for (String n: num) {
            sum += Integer.parseInt(n);
        }
        return sum;
    }
}
