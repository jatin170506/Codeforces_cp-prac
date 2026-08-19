import java.util.*;
public class Spell_check{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            if (n != 5)
                System.out.println("NO");
            else {
                char[] chars = s.toCharArray();
                Arrays.sort(chars);
                String sorted = new String(chars);

                char[] targetChars = "Timur".toCharArray();
                Arrays.sort(targetChars);
                String target = new String(targetChars);

                if (sorted.equals(target))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
        sc.close();
    }
}