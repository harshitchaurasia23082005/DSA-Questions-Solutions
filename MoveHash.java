import java.util.Scanner;

public class MoveHash {

    public static String moveHash(String str) {
        int hashCount = 0;
        String result = "";

        // Traverse the string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                hashCount++;
            } else {
                result = result + str.charAt(i);
            }
        }

        // Add hashes at the beginning
        String hashPart = "";
        for (int i = 0; i < hashCount; i++) {
            hashPart = hashPart + "#";
        }

        return hashPart + result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String input = sc.nextLine();

        String output = moveHash(input);

        System.out.println("Output: " + output);

        sc.close();
    }
}