import java.util.*;
public class Array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nA = sc.nextInt();
        int nB = sc.nextInt();
        int k = sc.nextInt();
        int m = sc.nextInt();
 
        int[] a = new int[nA];
        for (int i = 0; i < nA; i++)
            a[i] = sc.nextInt();
 
        int[] b = new int[nB];
        for (int i = 0; i < nB; i++)
            b[i] = sc.nextInt();
 
        int maxA = a[k - 1];       
        int minB = b[nB - m];      
 
        if (maxA < minB)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}