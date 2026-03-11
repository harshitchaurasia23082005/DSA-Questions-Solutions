public class MoveZeros {

    public static void main(String[] args) {

        int[] nums = {0,1,0,3,12};

        int index = 0;

        // move non-zero elements forward
        for(int i = 0; i < nums.length; i++){

            if(nums[i] != 0){
                nums[index] = nums[i];
                index++;
            }
        }

        // fill remaining with zeros
        while(index < nums.length){
            nums[index] = 0;
            index++;
        }

        // print array
        for(int num : nums){
            System.out.print(num + " ");
        }
    }
}
