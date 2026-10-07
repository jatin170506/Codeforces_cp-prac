import java.util.*;
public class Queue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int t = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        
        char[] arr = s.toCharArray();
        
        for (int sec = 0; sec < t; sec++) {
            char[] next = arr.clone();
            
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] == 'B' && arr[i + 1] == 'G') {
                    next[i] = 'G';
                    next[i + 1] = 'B';
                    i++;
                }
            }
            arr = next;
        }
        System.out.println(new String(arr));
        sc.close();
    }
}