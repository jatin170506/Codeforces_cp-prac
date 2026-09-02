import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int t = read.nextInt();
        while(t-->0){
            int n = read.nextInt();
            int m = read.nextInt();
            String x = read.next();
            String s = read.next();
            int operations = 0;
            while(!x.contains(s) && operations <=5){
                x = x+x;
                operations++;
            }
            if(x.contains(s)){
                System.out.println(operations);
            }
            else{
                System.out.println(-1);
            }
        }
    }
}