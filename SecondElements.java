import java.util.*;

public class SecondElements {

    public static void main(String[] args) {

        int[] arr = {1,2,4,7,7,5};

        Arrays.sort(arr);

        int secondSmall = -1;
        int secondLarge = -1;

        // second smallest
        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[0]){
                secondSmall = arr[i];
                break;
            }
        }

        // second largest
        for(int i = arr.length-2; i >= 0; i--){
            if(arr[i] != arr[arr.length-1]){
                secondLarge = arr[i];
                break;
            }
        }

        System.out.println("Second Smallest : " + secondSmall);
        System.out.println("Second Largest : " + secondLarge);
    }
}