import java.util.*;
public class Social{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int ans;
            if(n==2)
                ans = 2;
            else if(n==3)
                ans = 3;
            else
                ans = n%2;
            System.out.println(ans);
        }
    }
}