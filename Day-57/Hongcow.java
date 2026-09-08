import java.util.*;
public class Hongcow{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        
        Set<String> newS = new HashSet<>();
        String curr = s;
        for(int i=0;i<s.length();i++){
            newS.add(curr);
            curr = curr.charAt(curr.length() - 1) + curr.substring(0, curr.length() - 1);
        }
            
        System.out.println(newS.size());
        sc.close();
    }
}