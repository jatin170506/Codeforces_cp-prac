import java.util.*;
public class Reconnaissance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        
        int minDiff = Integer.MAX_VALUE;
        int bestI = -1, bestJ = -1;
        
        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            int diff = Math.abs(a[i] - a[j]);
            
            if (diff < minDiff) {
                minDiff = diff;
                bestI = i;
                bestJ = j;
            }
        }
        System.out.println((bestI + 1) + " " + (bestJ + 1));
        sc.close();
    }
}