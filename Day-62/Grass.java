import java.util.*;
public class Grass{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            int a11 = sc.nextInt();
            int a12 = sc.nextInt();
            int a21 = sc.nextInt();
            int a22 = sc.nextInt();
            
            int cnt = a11+a12+a21+a22;
            
            int ans;
            if(cnt == 0)
                ans = 0;
            else if(cnt == 4)
                ans = 2;
            else
                ans = 1;
            
            System.out.println(ans);
            
        }
    }
}
