import java.util.*;
public class Twice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] freq = new int[n + 1];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                freq[a[i]]++;
            }
            
            int score = 0;
            for (int i = 1; i <= n; i++)
                score += freq[i] / 2;
            
            System.out.println(score);
        }
    }
}