/**
 * THE LONGEST COMMON SUBSEQUENCE
 * Task 3 - Lab 10
 * Solution to: https://goo.gl/3x9hbD
 * Result: https://goo.gl/bTEmOq
 * Screenshot: http://prntscr.com/770tsc
 */

package io.github.thehappybug.Algorithms;

import java.util.Scanner;

public class LCS 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        for (int i=0; i<n; i++) {
            a[i] = scanner.nextInt();
        }

        for (int i=0; i<m; i++) {
            b[i] = scanner.nextInt();
        }

        lcs(a, b);
    }

    public static void lcs(int[] a, int[] b) 
    {
        int[][] mem = new int[a.length+1][b.length+1];
        for (int i = 0; i <= a.length; i++)
        {
            for (int j = 0; j <= b.length; j++)
            {
                if (i == 0 || j == 0)
                    mem[i][j] = 0;
                else if (a[i-1] == b[j-1])
                    mem[i][j] = mem[i-1][j-1] + 1;
                else
                    mem[i][j] = Math.max(mem[i-1][j], mem[i][j-1]);
            }
        }

        String output = "";

        int i = a.length, j = b.length;
        while (i > 0 && j > 0)
        {
            if (a[i-1] == b[j-1]) {
                output = a[i-1] + " " + output;
                i--; j--;
            } else if (mem[i-1][j] > mem[i][j-1]) {
                i--;
            } else {
                j--;
            }
        }

        System.out.println(output);
   }
}