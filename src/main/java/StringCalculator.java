import java.util.StringTokenizer;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) {
            return 0;
        }

        String[] num = numbers.split(",");
        int sum = 0;
        for (String n: num) {
            sum += Integer.parseInt(n);
        }
        return sum;
    }
}
