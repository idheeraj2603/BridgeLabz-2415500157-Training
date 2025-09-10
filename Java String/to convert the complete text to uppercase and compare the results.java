import java.util.Scanner;

public class UpperCaseCompare {

    public static String customToUpperCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result += (char)(c - 32);
            } else {
                result += c;
            }
        }
        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String customUpper = customToUpperCase(text);
        String builtInUpper = text.toUpperCase();
        boolean isEqual = compareStrings(customUpper, builtInUpper);
        System.out.println("Custom UpperCase: " + customUpper);
        System.out.println("Built-in UpperCase: " + builtInUpper);
        System.out.println("Comparison result: " + isEqual);
        sc.close();
    }
}
