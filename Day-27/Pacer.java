import java.util.*;
public class Pacer{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long m = sc.nextLong();

            long prev_A = 0;
            int prev_B = 0;
            long total = 0;

            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                int b = sc.nextInt();

                long L = a - prev_A;
                int p = prev_B ^ b; 

                if ((L % 2) == (p % 2))
                    total += L;
                else
                    total += L - 1;

                prev_A = a;
                prev_B = b;
            }
            total += (m - prev_A); 
            System.out.println(total);
        }
    }
}