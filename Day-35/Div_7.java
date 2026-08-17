import java.util.*;
public class Div_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = Integer.parseInt(s);
            if (n % 7 == 0) {
                System.out.println(s);
                continue;
            }
            char[] arr = s.toCharArray();
            boolean found = false;
            for (int i = 0; i < arr.length && !found; i++) {
                char original = arr[i];
                for (char digit = '0'; digit <= '9'; digit++) {
                    if (digit == original)
                        continue;
                    if (i == 0 && digit == '0')
                        continue;
                    arr[i] = digit;
                    int num = Integer.parseInt(new String(arr));
                    if (num % 7 == 0) {
                        System.out.println(new String(arr));
                        found = true;
                        break;
                    }
                }
                arr[i] = original;
            }
        }
        sc.close();
    }
}