package org.BinaryTrees;

public class Sorting {
    public int[] array;

    public Sorting(int size) {
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public void swap(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public void bubbleSort() {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    public void selectionSort() {
        int length = array.length;
        for (int i = 0; i < length - 1; i++){
            int indMin = i;
            for (int j = i + 1; j < length; j++){
                if (array[j] < array[indMin]) {
                    indMin = j;
                }
            }
            if (indMin != i) {
                swap(i, indMin);
            }
        }
    }

    public void insertionSort() {
        int length = array.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0 && array[j] < array[j - 1]; j--) {
                swap(j - 1, j);
            }
        }
    }

    public void shellSort() {
        int length = array.length;
        for (int step = length/2; step > 0; step /= 2) {
            for (int i = step; i < length; i++) {
                for (int j = i - step; j>0 && array[j] > array[j+step]; j -= step) {
                    swap(j, j+step);
                }
            }
        }
    }

}
