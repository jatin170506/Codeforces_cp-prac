import java.util.*;
 
public class Case_z_o{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();
        
        int cnt_z = 0, cnt_o = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0')
                cnt_z++;
            else
                cnt_o++;
        }
 
        System.out.println(Math.abs(cnt_z - cnt_o));
    }
}