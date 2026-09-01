import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] a = new int[n];
        int max = 0;
        for(int i=0 ; i<n ; i++){
            a[i] = read.nextInt();
            if(a[i] > max){
                max = a[i];
            }
        }
        int sum=0;
        for(int i=0; i<n ; i++){
            sum+=max-a[i];
        }
        System.out.println(sum);
    }
}