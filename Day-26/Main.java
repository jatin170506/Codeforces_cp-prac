import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] pos = new int[10];
        for (int i = 1; i <= 9; i++) {
            pos[i] = i - 1;
        }
        pos[0] = 9;
 
        while (t-- > 0) {
            String pin = sc.next();
            int current = pos[1];
            long total = 0;
 
            for (int i = 0; i < 4; i++) {
                int digit = pin.charAt(i) - '0';
                int target = pos[digit];
                total += Math.abs(target - current) + 1;
                current = target;
            }
 
            System.out.println(total);
        }
    }
}