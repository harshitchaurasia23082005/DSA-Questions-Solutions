import java.util.Scanner;

public class StringRotationCheck {

    public static boolean isRotation(String s, String goal) {

        if (s.length() != goal.length())
            return false;

        String temp = s + s;

        if (temp.contains(goal))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s = sc.nextLine();

        System.out.print("Enter goal string: ");
        String goal = sc.nextLine();

        boolean result = isRotation(s, goal);

        System.out.println("Output: " + result);

        sc.close();
    }
}