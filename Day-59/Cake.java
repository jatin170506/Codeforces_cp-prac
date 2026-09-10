import java.util.*;
public class Cake{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            
            int ans1 = simulate(a, b, true);   
            int ans2 = simulate(a, b, false);  
            
            System.out.println(Math.max(ans1, ans2));
        }
    }
    private static int simulate(long a, long b, boolean startWithA) {
        long usedA = 0, usedB = 0;
        long size = 1;
        int layers = 0;
        
        while (true) {
            boolean useA;
            if (layers % 2 == 0)
                useA = startWithA;
            else
                useA = !startWithA;
            
            if (useA) {
                if (usedA + size <= a)
                    usedA += size;
                else
                    break;
            } 
            else {
                if (usedB + size <= b)
                    usedB += size;
                else
                    break;
            }
            
            layers++;
            size *= 2;
        }
        return layers;
    }
}