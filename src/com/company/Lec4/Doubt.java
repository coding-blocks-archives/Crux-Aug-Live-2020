package com.company.Lec4;

public class Doubt {

    public static void main(String args[]) {
        int n = 5, row = 1, k = row;
        while (row <= 2 * n - 1) {
            int space = 1;
            while (space <= n - k) {
                System.out.print("  " + "\t");
                space = space + 1;
            }

            int num = 1, number = k;
            while (num <= 2 * k - 1) {
                System.out.print(number+" "+"\t");
                if (num >= k)
                    number = number - 1;
                else
                    number = number + 1;
                num = num + 1;
            }

            if (row < n)
                k = k + 1;
            else
                k = k - 1;
            System.out.println();
            row = row + 1;
        }
    }
}
