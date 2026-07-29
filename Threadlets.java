import java.util.*;
public class Threadlets{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
 
            long g = gcd(gcd(a, b), c);
            long sum = a + b + c;
 
            if (sum / g <= 6) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    static long gcd(long x, long y) {
        while (y != 0) {
            long temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
}