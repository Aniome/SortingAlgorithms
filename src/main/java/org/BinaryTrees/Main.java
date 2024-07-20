package org.BinaryTrees;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter array size: 16");
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        Sorting sorting = new Sorting(16);
        System.out.println("Original Array: ");
        System.out.println(Arrays.toString(sorting.array));
        //sorting.bubbleSort();
        //sorting.selectionSort();
        //sorting.insertionSort();
        //sorting.shellSort();
        //sorting.heapSort();
        sorting.quickSort();

        System.out.println("Sorted array: ");
        System.out.println(Arrays.toString(sorting.array));
    }
}