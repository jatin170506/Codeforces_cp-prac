import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long[] arr = new long[3];
            arr[0] = sc.nextLong();
            arr[1] = sc.nextLong();
            arr[2] = sc.nextLong();

            while (true) {
                Arrays.sort(arr);
                long lo = arr[0], mid = arr[1], hi = arr[2];

                if (hi > lo + mid) {
                    arr[2] = lo + mid;
                } else {
                    break;
                }
            }
            Arrays.sort(arr);
            System.out.println(arr[2] - arr[0]);
        }
    }
}