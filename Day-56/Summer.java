import java.util.*;
public class Summer{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        Set<String> leaves = new HashSet<>();
        
        for(int i=0;i<n;i++){
            String species = sc.next();
            String color = sc.next();
            leaves.add(species + " " + color);
        }
        System.out.println(leaves.size());
    }
}