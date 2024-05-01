package carey_CMSC_6_isprime;
import static org.junit.Assert.*;
import org.junit.Test;
//package carey_CMSC_6_isprime;
public class Carey_Project6_PrimeNumberMethodTest {
	@Test
    public void testIsPrime() {
        // Test cases for the isPrime method
		/**
		 * for all the method tests in the class asserttrue and false
		 * is being used to test whether or not the numbers are prime
		 */
		
        assertTrue(Carey_Project6_PrimeNumberMethodTest.isPrime(2)); // 2 is a prime number
        assertTrue(Carey_Project6_PrimeNumberMethodTest.isPrime(3)); // 3 is a prime number
        assertTrue(Carey_Project6_PrimeNumberMethodTest.isPrime(5)); // 5 is a prime number
        assertTrue(Carey_Project6_PrimeNumberMethodTest.isPrime(7)); // 7 is a prime number
        assertTrue(Carey_Project6_PrimeNumberMethodTest.isPrime(11)); // 11 is a prime number

        assertFalse(Carey_Project6_PrimeNumberMethodTest.isPrime(1)); // 1 is not a prime number
        assertFalse(Carey_Project6_PrimeNumberMethodTest.isPrime(4)); // 4 is not a prime number
        assertFalse(Carey_Project6_PrimeNumberMethodTest.isPrime(6)); // 6 is not a prime number
        assertFalse(Carey_Project6_PrimeNumberMethodTest.isPrime(8)); // 8 is not a prime number
        assertFalse(Carey_Project6_PrimeNumberMethodTest.isPrime(9)); // 9 is not a prime number
        assertFalse(Carey_Project6_PrimeNumberMethodTest.isPrime(10)); // 10 is not a prime number
        assertFalse(Carey_Project6_PrimeNumberMethodTest.isPrime(12)); // 12 is not a prime number
}
	public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        if (number <= 3) {
            return true; // 2 and 3 are prime numbers
        }
        if (number % 2 == 0 || number % 3 == 0) {
            return false; // numbers divisible by 2 or 3 are not prime
        }

        // Check for prime numbers using trial division method
        for (int i = 5; i * i <= number; i += 6) {
            if (number % i == 0 || number % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}
	
