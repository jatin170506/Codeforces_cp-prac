import java.util.*;
public class Odd_sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int odd = 0, even = 0;
            for (int i = 0; i < n; i++){
                int x = sc.nextInt();
                if (x % 2 == 0) 
                    even++;
                else 
                    odd++;
            }
 
            if (odd == 0)
                System.out.println("NO");
            else if (even == 0)
                System.out.println(n % 2 == 1 ? "YES" : "NO");
            else
                System.out.println("YES");
        }
        sc.close();
    }
}