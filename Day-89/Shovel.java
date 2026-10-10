import java.util.*;
public class Shovel{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int r = sc.nextInt();

        for (int x = 1; x <= 10; x++) {
            int last = (k * x) % 10;
            if (last == 0 || last == r) {
                System.out.println(x);
                break;
            }
        }
        sc.close();
    }
}