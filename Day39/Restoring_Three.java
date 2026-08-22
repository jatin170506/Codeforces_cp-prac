import java.util.*;
public class Restoring_Three{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        long[] numbers = new long[4];
        for (int i = 0; i < 4; i++) {
            numbers[i] = scanner.nextLong();
        }
        Arrays.sort(numbers);
        
        long totalSum = numbers[3];
        long a = totalSum - numbers[0];
        long b = totalSum - numbers[1];
        long c = totalSum - numbers[2];
        
        System.out.println(a + " " + b + " " + c);
        scanner.close();
    }
}