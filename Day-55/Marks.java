import java.util.*;
public class Marks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] grades = new int[n][m];
        for (int i = 0; i < n; i++) {
            String row = sc.next();
            for (int j = 0; j < m; j++)
                grades[i][j] = row.charAt(j) - '0';
        }
 
        int[] maxMark = new int[m];
        for (int j = 0; j < m; j++) {
            int max = 0;
            for (int i = 0; i < n; i++)
                max = Math.max(max, grades[i][j]);
            maxMark[j] = max;
        }
 
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean successful = false;
            for (int j = 0; j < m; j++) {
                if (grades[i][j] == maxMark[j]) {
                    successful = true;
                    break;
                }
            }
            if (successful) 
		        count++;
        }
        System.out.println(count);
        sc.close();
    }
}
