import java.util.*;
public class Coins{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int minAbs = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            minAbs = Math.min(minAbs, Math.abs(x));
        }
        
        System.out.println(minAbs);
    }
}