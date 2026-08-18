import java.util.*;
public class Long_Comparison{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) 
            return; 
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long x1 = sc.nextInt();
            int p1 = sc.nextInt();
            long x2 = sc.nextInt();
            int p2 = sc.nextInt();
            
            int len1 = String.valueOf(x1).length() + p1;
            int len2 = String.valueOf(x2).length() + p2;
            
            if (len1 > len2)
                System.out.println(">");
            else if (len1 < len2)
                System.out.println("<");
            else {
                while (String.valueOf(x1).length() < String.valueOf(x2).length()) {
                    x1 *= 10;
                }
                while (String.valueOf(x2).length() < String.valueOf(x1).length()) {
                    x2 *= 10;
                }
                
                if (x1 > x2) {
                    System.out.println(">");
                } else if (x1 < x2) {
                    System.out.println("<");
                } else {
                    System.out.println("=");
                }
            }
        }
        sc.close();
    }
}