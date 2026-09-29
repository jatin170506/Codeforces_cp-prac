import java.util.*;
public class Coin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            
            boolean ans;
            
            if (k % 2 == 0)
                ans = (n % 2 == 0);
            else {
                if (n % 2 == 0)
                    ans = true;
                else
                    ans = (n >= k);
            }
            
            System.out.println(ans ? "YES" : "NO");
        }
    }
}