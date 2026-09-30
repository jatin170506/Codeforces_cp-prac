import java.util.*;
public class Odd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int evenCount = 0, oddCount = 0;
            
            for (int i = 0; i < 2 * n; i++) {
                int x = sc.nextInt();
                if (x % 2 == 0)
                    evenCount++;
                else
                    oddCount++;
            }
            
            if (evenCount == oddCount)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }
}