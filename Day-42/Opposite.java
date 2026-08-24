import java.util.*;
public class Opposite{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            
            long n = 2 * Math.abs(a-b);
            
            if(a>n || b>n || c>n){
                System.out.println(-1);
                continue;
            }
            long half = n/2;
            long d;
            if(c<=half)
                d = c + half;
            else
                d = c - half;
                
            System.out.println(d);
        }
    }
}