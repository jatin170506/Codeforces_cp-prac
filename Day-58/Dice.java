import java.util.*;
public class Dice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int firstWins = 0, draw = 0, secondWins = 0;
        
        for(int i=1;i<=6;i++){
            int diffA = Math.abs(a-i);
            int diffB = Math.abs(b-i);
            
            if(diffA < diffB)
                firstWins++;
            else if(diffB == diffA)
                draw++;
            else
                secondWins++;
        }
        System.out.println(firstWins + " " + draw + " " + secondWins);
    }
}