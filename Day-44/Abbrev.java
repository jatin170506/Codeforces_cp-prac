import java.util.*;
public class Abbrev{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int[] a = new int[n];
            int sum = 0;
 
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }
 
            Arrays.sort(a);
            int maxFreq = 1;
            int currentFreq = 1;
            int maxValue = a[0];
 
            for (int i = 1; i < n; i++) {
                if (a[i] == a[i - 1])
                    currentFreq++;
                else
                    currentFreq = 1;
 
                if (currentFreq > maxFreq) {
                    maxFreq = currentFreq;
                    maxValue = a[i];
                }
            }
 
            int others = n - maxFreq;
 
            if (maxFreq <= others + 1)
                System.out.println(sum);
            else {
                int ans = 0;
                for (int i = 0; i < n; i++) {
                    if (a[i] != maxValue) {
                        ans += a[i];
                    }
                }
                ans += maxValue * (others + 2);
                System.out.println(ans);
            }
        }
    }
}