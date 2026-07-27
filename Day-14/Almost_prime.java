import java.util.*;

public class Almost_prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        for (int num = 2; num <= n; num++) {
            if (countDistinctPrimeFactors(num) == 2) {
                count++;
            }
        }

        System.out.println(count);
    }

    static int countDistinctPrimeFactors(int num) {
        int count = 0;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                count++;
                while (num % i == 0) {
                    num /= i;
                }
            }
        }
        if (num > 1) {
            count++;
        }
        return count;
    }
}