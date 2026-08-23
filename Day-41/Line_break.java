import java.util.*;
public class Line_break{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
 
            int totalLength = 0;
            int x = 0;
            boolean stillFits = true;
 
            for (int i = 0; i < n; i++) {
                String word = sc.next();
                if (stillFits) {
                    totalLength += word.length();
                    if (totalLength <= m)
                        x++;
                    else
                        stillFits = false;
                }
            }
            System.out.println(x);
        }
        sc.close();
    }
}