public class NumberChecker {

    
    public static boolean prime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

 
    public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    // ✅ Check if a number is spy
    public static boolean isSpy(int num) {
        int sum = 0, product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
         public static boolean isNeon(int num) {
        int square = num * num;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == num;
    }

    // ✅ Check if a number is spy
    public static boolean isSpy(int num) {
        int sum = 0, product = 1;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            product *= digit;
            num /= 10;
        }
        return sum == product;
    }

    // ✅ Check if a number is automorphic
    public static boolean isAutomorphic(int num) {
        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    // ✅ Check if a number is buzz
    public static boolean isBuzz(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    // 🧪 Main method to test all checks
    public static void main(String[] args) {
        int[] testNumbers = {5, 7, 9, 13, 21, 27};

        for (int num : testNumbers) {
            System.out.println("Checking number: " + num);
            System.out.println("Is Prime? " + isPrime(num));
            System.out.println("Is Neon? " + isNeon(num));
            System.out.println("Is Spy? " + isSpy(num));
            System.out.println("Is Automorphic? " + isAutomorphic(num));
            System.out.println("Is Buzz? " + isBuzz(num));
            System.out.println("-----------------------------");
        }
    }
}

