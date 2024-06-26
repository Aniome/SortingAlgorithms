package org.BinaryTrees;

public class Sorting {
    public int[] array;

    public Sorting(int size) {
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    public void bubbleSort() {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort() {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            int indMin = i;
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[indMin]) {
                    indMin = j;
                }
            }
            if (indMin != i) {
                int temp = array[i];
                array[i] = array[indMin];
                array[indMin] = temp;
            }
        }
    }
}
