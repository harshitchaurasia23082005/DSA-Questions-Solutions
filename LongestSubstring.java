import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstring {

    public static int longestUniqueSubstring(String s) {

        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String s = sc.nextLine();

        int result = longestUniqueSubstring(s);

        System.out.println("Output: " + result);

        sc.close();
    }
}