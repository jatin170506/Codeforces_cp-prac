import java.util.*;
public class Kefa{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int cnt = 1;
        int maxCnt = 1;
        for (int i = 1; i < n; i++){
            if (a[i] >= a[i - 1])
                cnt++;
            else
                cnt = 1;
            maxCnt = Math.max(maxCnt, cnt);
        }
        System.out.println(maxCnt);
        sc.close();
    }
}