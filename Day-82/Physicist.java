import java.util.*;
public class Physicist{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int sumX = 0, sumY = 0, sumZ = 0;
        sc.nextLine();
        
        while (n-- > 0){
            int x = sc.nextInt();
            sumX += x;
            int y = sc.nextInt();
            sumY += y;
            int z = sc.nextInt();
            sumZ += z;
        }
        sc.close();
        
        if (sumX == 0 && sumY == 0 && sumZ == 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}