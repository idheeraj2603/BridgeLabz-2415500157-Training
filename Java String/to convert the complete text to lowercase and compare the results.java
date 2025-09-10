import java.util.Scanner;

public class LowerCaseCompare {

    public static String customToLowerCase(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result += (char)(c + 32);
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
        String customLower = customToLowerCase(text);
        String builtInLower = text.toLowerCase();
        boolean isEqual = compareStrings(customLower, builtInLower);
        System.out.println("Custom LowerCase: " + customLower);
        System.out.println("Built-in LowerCase: " + builtInLower);
        System.out.println("Comparison result: " + isEqual);
        sc.close();
    }
}
