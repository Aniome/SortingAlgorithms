package org.BinaryTrees;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Enter array size: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Sorting sorting = new Sorting(n);
        //sorting.bubbleSort();
        sorting.selectionSort();

        System.out.println(Arrays.toString(sorting.array));

    }
}