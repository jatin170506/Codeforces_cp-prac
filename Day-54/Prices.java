import java.util.*;
public class Prices{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int q = sc.nextInt();
        while(q-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            
            long[] a = new long[n];
            long minA = Long.MAX_VALUE;
            long maxA = Long.MIN_VALUE;
            
            for(int i=0;i<n;i++){
                a[i] = sc.nextLong();
                minA = Math.min(a[i], minA);
                maxA = Math.max(a[i], maxA);
            }
            
            long res = minA + k;
            
            if(res >= maxA - k && res > 0)
                System.out.println(res);
            else
                System.out.println(-1);
        }
    }
}