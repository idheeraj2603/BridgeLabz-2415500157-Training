class PalindromeChecker {
    String text;

    PalindromeChecker(String text) {
        this.text = text;
    }

    boolean isPalindrome() {
        String rev = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(rev);
    }

    void displayResult() {
        System.out.println("Text: " + text);
        System.out.println("Palindrome: " + isPalindrome());
    }

    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker("Level");
        p.displayResult();
    }
}
