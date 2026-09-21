import java.util.*;
public class Positive{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int zeros = 0, negatives = 0;
            
            for (int i = 0; i < n; i++){
                int x = sc.nextInt();
                if (x == 0) 
                    zeros++;
                else if (x == -1) 
                    negatives++;
            }
            
            int operations = zeros;
            
            if (negatives % 2 == 1)
                operations += 2; 
            
            System.out.println(operations);
        }
    }
}