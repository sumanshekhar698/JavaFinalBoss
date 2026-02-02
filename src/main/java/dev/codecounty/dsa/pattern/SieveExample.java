package dev.codecounty.dsa.pattern;

import java.util.Scanner;
import java.util.Arrays;

public class SieveExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Find primes up to: ");
        int n = sc.nextInt();

        findPrimes(n);

    }

    public static void findPrimes(int n) {
        boolean[] isPrime = new boolean[n + 1];
        // Fill array with true using built-in utility
        Arrays.fill(isPrime, true);

        // 0 and 1 are not prime
        if (n >= 0) isPrime[0] = false;
        if (n >= 1) isPrime[1] = false;

        // The Sieve Logic
        for (int p = 2; p * p <= n; p++) {
            // If isPrime[p] is not changed, then it is a prime
            if (isPrime[p]) {
                // Update all multiples of p starting from p*p
                for (int i = p * p; i <= n; i += p)
                    isPrime[i] = false;
            }
        }

        // Print all prime numbers
        System.out.println("Primes between 1 and " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }
}