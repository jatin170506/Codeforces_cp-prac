<<<<<<< HEAD
import java.util.*;
public class Candies{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long n = sc.nextLong();
            long x = -1;
            for (int k = 2; k <= 31; k++) {
                long divisor = (long) Math.pow(2, k) - 1;
                if (divisor > n) 
                    break;
                if (n % divisor == 0) {
                    x = n / divisor;
                    break;
                }
            }
            System.out.println(x);
        }
        sc.close();
    }
=======
import java.util.*;
public class Candies{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
 
        while (t-- > 0) {
            long n = sc.nextLong();
            long x = -1;
            for (int k = 2; k <= 31; k++) {
                long divisor = (long) Math.pow(2, k) - 1;
                if (divisor > n) 
                    break;
                if (n % divisor == 0) {
                    x = n / divisor;
                    break;
                }
            }
            System.out.println(x);
        }
        sc.close();
    }
>>>>>>> dbffa86b5bdd5840cd02960a8aff3f5b8108cb49
}