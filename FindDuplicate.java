public class FindDuplicate {

    public static void main(String[] args) {

        int[] arr = {1,3,4,2,2};

        boolean[] seen = new boolean[arr.length];

        for(int num : arr){

            if(seen[num]){
                System.out.println(num);
                break;
            }

            seen[num] = true;
        }
    }
}