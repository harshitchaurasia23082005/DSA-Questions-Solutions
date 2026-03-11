import java.util.Scanner;

public class CountingValley {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of steps: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter path: ");
        String path = sc.nextLine();

        int level = 0;
        int valleys = 0;

        for (int i = 0; i < n; i++) {
            char step = path.charAt(i);

            if (step == 'U') {
                level++;
                if (level == 0) {
                    valleys++; // came up to sea level from valley
                }
            } 
            else if (step == 'D') {
                level--;
            }
        }

        System.out.println("Output: " + valleys);

        sc.close();
    }
}