/**
 * FIBONACCI MODIFIED
 * Task 2 - Lab 10
 * Solution to: https://goo.gl/shnrr5
 * Result: https://goo.gl/ipO03o
 * Screenshot: http://prntscr.com/7701pg
 */

package io.github.thehappybug.Algorithms;

import java.util.Scanner;
import java.math.BigInteger;

public class FibonacciModified 
{
    private BigInteger[] mem;
    private int aa;
    private int bb;

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();

        FibonacciModified algo = new FibonacciModified(a, b);
        System.out.println(algo.fib(n));
    }

    public FibonacciModified(int a, int b) 
    {
        aa = a;
        bb = b;
    }

    public BigInteger fib(int n) 
    {
        mem = new BigInteger[n+1];
        mem[1] = BigInteger.valueOf(aa);
        mem[2] = BigInteger.valueOf(bb);

        for (int i=3; i<=n; i++) {
            mem[i] = mem[i-1].pow(2).add(mem[i-2]);
        }

        return mem[n];
    }
}