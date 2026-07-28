import java.util.*;
 
public class Promo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
 
        long[] p = new long[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextLong();
        }
        Arrays.sort(p); 
 
        long[] prefix = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefix[i + 1] = prefix[i] + p[i];
        }
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            long answer = prefix[n - x + y] - prefix[n - x];
            System.out.println(answer);
        }
    }
}