import java.util.*;
public class Ten_word{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            
            int bestIndex = -1;
            int bestQuality = -1;
            
            for (int i = 1; i <= n; i++){
                int a = sc.nextInt();
                int b = sc.nextInt();
                
                if (a <= 10 && b > bestQuality) {
                    bestQuality = b;
                    bestIndex = i;
                }
            }
            System.out.println(bestIndex);
        }
    }
}