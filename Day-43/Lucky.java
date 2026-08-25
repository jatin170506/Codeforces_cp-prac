import java.util.*;

public class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            int max = -1;
            int ans = -1;

            for (int i = l; i <= r; i++) {
                int n = i;
                int maxDigit = 0;
                int minDigit = 9;

                while (n > 0) {
                    int x = n % 10;

                    maxDigit = Math.max(maxDigit, x);
                    minDigit = Math.min(minDigit, x);

                    n = n / 10;
                }

                int luck = maxDigit - minDigit;

                if (luck > max) {
                    max = luck;
                    ans = i;
                }

                if (max == 9)
                    break;
            }

            System.out.println(ans);
        }
    }
}