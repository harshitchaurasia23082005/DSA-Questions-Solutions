import java.util.*;

public class MaxMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sem = sc.nextInt();

        for (int i = 1; i <= sem; i++) {

            int subjects = sc.nextInt();
            int max = Integer.MIN_VALUE;

            for (int j = 0; j < subjects; j++) {

                int mark = sc.nextInt();

                if (mark < 0 || mark > 100) {
                    System.out.println("You have entered invalid mark.");
                    return;
                }

                max = Math.max(max, mark);
            }

            System.out.println("Maximum mark in " + i + " semester: " + max);
        }
    }
}