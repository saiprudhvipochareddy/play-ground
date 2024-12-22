package com.javaconcepts.details;

import java.util.Scanner;

public class Hashing {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n;
            System.out.println("Enter size of array: ");
            n = sc.nextInt();
            System.out.println("Enter array values: ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            //precompute:
            int[] hash = new int[13];
            for (int i = 0; i < n; i++) {
                hash[arr[i]] += 1;
            }

            System.out.println("Enter size of array queue: ");
            int q;
            q = sc.nextInt();
            while (q-- != 0) {
                int number;
                System.out.println("number to search: ");
                number = sc.nextInt();
                // fetching:
                System.out.println(hash[number]);
            }
        }
}
