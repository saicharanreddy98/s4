public class Prime {
    public static void main(String[] args) {
        int number = 30; // Change this value to check for a different number

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0, 1, and negative numbers are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) { // Check up to the square root
            if (number % i == 0) {
                return false; // Number is divisible, so it's not prime
            }
        }
        return true; // No divisors found, so it's prime
    }
}
