import java.util.*;
public class Sushi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        List<Integer> sushi = new ArrayList<>();
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (t[i] == t[i - 1]) {
                count++;
            } 
            else{
                sushi.add(count);
                count = 1;
            }
        }
        sushi.add(count);
        int maxLen = 0;
        for (int i = 0; i < sushi.size() - 1; i++) {
            int candidate = 2 * Math.min(sushi.get(i), sushi.get(i + 1));
            maxLen = Math.max(maxLen, candidate);
        }
        System.out.println(maxLen);
    }
}