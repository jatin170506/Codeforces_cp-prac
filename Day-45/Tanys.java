import java.util.*;
public class Tanys{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
 
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
 
        List<Integer> stairways = new ArrayList<>();
        int i = 0;
        while (i < n){
            int start = i;
            i++;
            while (i < n && a[i] != 1)
                i++;
            stairways.add(a[i - 1]);
        }
 
        System.out.println(stairways.size());
        for (int j = 0; j < stairways.size(); j++){
            System.out.print(stairways.get(j));
            if (j < stairways.size() - 1) 
                System.out.print(' ');
        }
        System.out.println();
    }
}