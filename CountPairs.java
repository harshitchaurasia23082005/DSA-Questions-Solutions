import java.util.*;

public class CountPairs {

    public static void main(String[] args) {

        int[] arr = {1,5,7,-1,5};
        int target = 6;

        HashMap<Integer,Integer> map = new HashMap<>();

        int count = 0;

        for(int num : arr){

            int complement = target - num;

            if(map.containsKey(complement)){
                count += map.get(complement);
            }

            map.put(num, map.getOrDefault(num,0) + 1);
        }

        System.out.println(count);
    }
}