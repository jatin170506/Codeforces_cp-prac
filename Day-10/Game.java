import java.util.*;
public class Game{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        
        int minVal = Math.min(n, m);

        if (minVal % 2 == 1) {
            System.out.println("Akshat");
        } else {
            System.out.println("Malvika");
        }
    }
}