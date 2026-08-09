import java.io.*;

class NumberAnalysisTool {
    
    static boolean isPrime(int n) {
        if (n <= 1) return false;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        return count == 2;
    }
    
    static boolean isPalindrome(int n) {
        return n == reverseNumber(n);
    }
    
    static boolean isArmstrong(int n) {
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            int rem = temp % 10;
            sum = sum + (rem * rem * rem);
            temp = temp / 10;
        }
        return n == sum;
    }
    
    static int sumOfDigits(int n) {
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            sum = sum + (temp % 10);
            temp = temp / 10;
        }
        return sum;
    }
    
    static int reverseNumber(int n) {
        int temp = n;
        int rev = 0;
        while (temp > 0) {
            rev = (rev * 10) + (temp % 10);
            temp = temp / 10;
        }
        return rev;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter an integer: ");
        int num = Integer.parseInt(br.readLine());
        
        int choice;
        
        do {
            System.out.println("\n--- Number Analysis Tool ---");
            System.out.println("1. Check Prime");
            System.out.println("2. Check Palindrome");
            System.out.println("3. Check Armstrong");
            System.out.println("4. Find Sum of Digits");
            System.out.println("5. Reverse the Number");
            System.out.println("6. Exit");
            
            System.out.print("Select an option: ");
            choice = Integer.parseInt(br.readLine());
            
            switch (choice) {
                case 1:
                    if (isPrime(num)) {
                        System.out.println(num + " is a Prime number.");
                    } else {
                        System.out.println(num + " is not a Prime number.");
                    }
                    break;
                case 2:
                    if (isPalindrome(num)) {
                        System.out.println(num + " is a Palindrome.");
                    } else {
                        System.out.println(num + " is not a Palindrome.");
                    }
                    break;
                case 3:
                    if (isArmstrong(num)) {
                        System.out.println(num + " is an Armstrong number.");
                    } else {
                        System.out.println(num + " is not an Armstrong number.");
                    }
                    break;
                case 4:
                    System.out.println("Sum of digits is: " + sumOfDigits(num));
                    break;
                case 5:
                    System.out.println("Reverse of the number is: " + reverseNumber(num));
                    break;
                case 6:
                    System.out.println("Exiting the tool...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 6);
    }
}
