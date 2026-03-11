import java.util.*;

public class MinDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        String minItem = "";
        int minDiscount = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(",");
            String name = input[0];
            int price = Integer.parseInt(input[1]);
            int discount = Integer.parseInt(input[2]);

            int discountAmount = price * discount / 100;

            if (discountAmount < minDiscount) {
                minDiscount = discountAmount;
                minItem = name;
            }
        }

        System.out.println(minItem);
    }
}
