import java.util.*;
public class Registration{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        HashMap<String, Integer> hm = new HashMap<>();
        
        for (int i = 0; i < n; i++){
            String s = sc.nextLine();
            if (hm.containsKey(s)){
                int currentCount = hm.get(s);
                hm.put(s, currentCount + 1);
                System.out.println(s + "" + currentCount);
            } 
            else{
                hm.put(s, 1);
                System.out.println("OK");
            }
        }
        sc.close();
    }
}