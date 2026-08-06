import java.util.*;
public class Riptide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
        while (t-- > 0) {
            int[] a = new int[3];
            for (int i = 0; i < 3; i++)
                a[i] = sc.nextInt();
 
            int round = 0;
            while (a[0] != a[1] && a[1] != a[2] && a[0] != a[2]) {
                Arrays.sort(a);
                a[0]++;
                a[2]--;
                round++;
            }
            System.out.println(round);
        }
    }
}