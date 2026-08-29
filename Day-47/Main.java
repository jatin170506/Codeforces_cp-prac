import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while(t-->0){
            int x = read.nextInt();
            int y = read.nextInt();
            int n = read.nextInt();
            int k = n - (n-y) % x;
            System.out.println(k);
        }
    }
}