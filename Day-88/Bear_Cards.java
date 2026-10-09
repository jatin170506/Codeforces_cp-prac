import java.util.*;
public class Bear_Cards{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] t = new int[5];
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            t[i] = sc.nextInt();
            sum += t[i];
        }

        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int num : t)
            mp.put(num, mp.getOrDefault(num, 0) + 1);

        int maxSaving = 0;
        for (Map.Entry<Integer, Integer> e : mp.entrySet()){
            int value = e.getKey();
            int freq = e.getValue();
            if (freq >= 2)
                maxSaving = Math.max(maxSaving, value * Math.min(freq, 3));
        }
        System.out.println(sum - maxSaving);
        sc.close();
    }
}