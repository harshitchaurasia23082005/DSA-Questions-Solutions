import java.util.Scanner;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        char result = ' ';

        for (int i = 0; i < str.length(); i++) {
            boolean isUnique = true;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                result = str.charAt(i);
                break;
            }
        }

        if (result != ' ')
            System.out.println("Output: " + result);
        else
            System.out.println("No non-repeated character found");

        sc.close();
    }
}