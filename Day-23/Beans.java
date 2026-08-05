import java.util.*;
public class Beans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long r = sc.nextLong();
            long b = sc.nextLong();
            long d = sc.nextLong();

            long hi = Math.max(r, b);
            long lo = Math.min(r, b);

            if (hi <= lo * (d + 1))
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
    }
}