import java.util.*;

public class KthLargest {

    public static void main(String[] args) {

        int[] nums = {3,2,1,5,6,4};
        int k = 2;

        Arrays.sort(nums);

        int result = nums[nums.length - k];

        System.out.println(result);
    }
}