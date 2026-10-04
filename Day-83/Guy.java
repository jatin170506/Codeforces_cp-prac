import java.util.*;
public class Guy{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Set<Integer> s = new HashSet<>();
        
        int p = sc.nextInt();
        int[] a = new int[p];
        for (int i = 0; i < p; i++) {
            a[i] = sc.nextInt();
            s.add(a[i]);
        }
        
        int q = sc.nextInt();
        int[] b = new int[q];
        for (int i = 0; i < q; i++) {
            b[i] = sc.nextInt();
            s.add(b[i]); 
        }
        
        boolean canPassAll = true;
        for (int level = 1; level <= n; level++) {
            if (!s.contains(level)) {
                canPassAll = false;
                break;
            }
        }
        
        if (canPassAll)
            System.out.println("I become the guy.");
        else
            System.out.println("Oh, my keyboard!");
        sc.close();
    }
}
