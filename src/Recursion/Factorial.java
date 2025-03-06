package Recursion;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger factorial(int n) {
        if (n == 0) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }
    public static void main(String[] args) {
        int n = 0;
        System.out.println(factorial(n));
    }
}
