import java.util.*;
public class Coins{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        
        while (t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int n = sc.nextInt();
            
            int max = Math.max(Math.max(a, b), c);
            int needB = max - b;
            int needC = max - c;
            int needA = max - a;
            
            int required = needA + needB + needC;
            int remaining = n - required;
            
            if (remaining >= 0 && remaining % 3 == 0)
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
    }
}