import java.util.*;
public class Cat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            
            if (s.matches("[mM]+[eE]+[oO]+[wW]+"))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}