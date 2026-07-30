import java.util.*;
public class Sleep{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
            int H = sc.nextInt();
            int M = sc.nextInt();
 
            int bedTime = H * 60 + M;
            int minDiff = Integer.MAX_VALUE;
 
            for (int i = 0; i < n; i++) {
                int h = sc.nextInt();
                int m = sc.nextInt();
                int alarmTime = h * 60 + m;
 
                int diff = alarmTime - bedTime;
                if (diff < 0) {
                    diff += 24 * 60; 
                }
                if (diff < minDiff) {
                    minDiff = diff;
                }
            }
            int hours = minDiff / 60;
            int minutes = minDiff % 60;
            System.out.println(hours + " " + minutes);
        }
    }
}