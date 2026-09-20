import java.util.*;
public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0){
            String s = sc.next();
            
            int[] freq = new int[26];
            for (char c : s.toCharArray())
                freq[c - 'a']++;
            
            int countPairable = 0;
            for (int i = 0; i < 26; i++){
                if (freq[i] >= 2)
                    countPairable++;
            }
            
            if (countPairable >= 2)
                System.out.println("YES");
            else 
                System.out.println("NO");
        }
    }
}