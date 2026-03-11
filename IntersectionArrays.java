import java.util.*;

public class IntersectionArrays {

    public static void main(String[] args) {

        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> result = new HashSet<>();

        for(int num : nums1){
            set1.add(num);
        }

        for(int num : nums2){
            if(set1.contains(num)){
                result.add(num);
            }
        }

        for(int num : result){
            System.out.print(num + " ");
        }
    }
}