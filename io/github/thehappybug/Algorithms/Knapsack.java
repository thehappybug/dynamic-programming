/**
 * KNAPSACK
 * Task 1 - Lab 10
 * Solution to: https://goo.gl/X3HulT
 * Result: https://goo.gl/ZLfrUY
 * Screenshot: http://prntscr.com/76zp67
 */

package io.github.thehappybug.Algorithms;

import java.util.Scanner;

public class Knapsack 
{
    private int[] mem;

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int cases = scanner.nextInt();
        for (int i = 0; i < cases; ++i) {
            Knapsack algo = new Knapsack(2001);
            int numOfElems = scanner.nextInt();
            int size = scanner.nextInt();
            int[] elems = new int[numOfElems];
            for (int j = 0; j < numOfElems; ++j) {
                elems[j] = scanner.nextInt();
            }
            System.out.println(Integer.toString(algo.knapsack(elems, size)));
        }
    }

    public Knapsack(int size) 
    {
        mem = new int[size];
        for (int i = 0; i < size; ++i) {
            mem[i] = 0;
        }
    }

    public int knapsack(int[] elems, int size) 
    {
        for (int weigh = 1; weigh <= size; ++weigh) {
            for (int i = 0; i < elems.length; ++i) {
                if (elems[i] <= weigh) {        
                    mem[weigh] = Math.max(mem[weigh], (elems[i] + mem[weigh - elems[i]]));
                }
            }
        }
        return mem[size];
    }
}