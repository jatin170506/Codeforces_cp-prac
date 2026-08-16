import java.util.*;
public class Flag{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
 
        String[] rows = new String[n];
        for (int i = 0; i < n; i++) {
            rows[i] = sc.next();
        }
 
        boolean valid = true;
        for (int i = 0; i < n; i++) {
            char first = rows[i].charAt(0);
            for (int j = 1; j < m; j++) {
                if (rows[i].charAt(j) != first)
                    valid = false;
            }
            if (i > 0 && rows[i].charAt(0) == rows[i - 1].charAt(0))
                valid = false;
        }
        System.out.println(valid ? "YES" : "NO");
    }
}