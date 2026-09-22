import java.util.*;
public class Blank{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();
            
            int maxLen = 0;
            int currentLen = 0;
            
            for (int i = 0; i < n; i++) {
                if (a[i] == 0) {
                    currentLen++;
                    maxLen = Math.max(maxLen, currentLen);
                } 
                else
                    currentLen = 0;
            }
            
            System.out.println(maxLen);
        }
    }
}