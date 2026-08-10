import java.util.*;
public class Chips_Moving{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        System.out.println(Math.min(evenCount, oddCount));
    }
}
