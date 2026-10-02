import java.util.*;
public class Pangram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        
        s = s.toLowerCase();
        if(n<26)
            System.out.println("NO");
        else {
            Set<Character> seen = new HashSet<>();
            for (char c : s.toCharArray())
                seen.add(c);
            
            if (seen.size() == 26)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}