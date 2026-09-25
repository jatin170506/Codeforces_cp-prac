import java.util.*;
public class Substrings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        
        while (t-- > 0){
            String b = sc.nextLine();
            int m = b.length();
            int n = m / 2 + 1;
            
            String a = "";
            a += b.charAt(0);
            
            for (int i = 1; i < n; i++)
                a += b.charAt(2 * i - 1);
            
            System.out.println(a);
        }
    }
}