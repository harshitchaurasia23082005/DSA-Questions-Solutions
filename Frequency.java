import java.util.*;

public class Frequency {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,1,4,5,1,2};
        Map<Integer,Integer> map = new HashMap<>();

        for(int num : arr)
            map.put(num, map.getOrDefault(num,0)+1);

        for(int key : map.keySet())
            System.out.println(key + " occurs " + map.get(key) + " times");
    }
}