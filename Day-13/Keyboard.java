import java.util.*;
public class Keyboard{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String direction = sc.nextLine();
        String s = sc.nextLine();
        
        String keyboard = "qwertyuiopasdfghjkl;zxcvbnm,./";
        
        for (int i = 0; i < s.length(); i++) {
            int pos = keyboard.indexOf(s.charAt(i));
            if (direction.equals("R")){
                System.out.print(keyboard.charAt(pos - 1));
            } 
            else{
                System.out.print(keyboard.charAt(pos + 1));
            }
        }
        
    }
}