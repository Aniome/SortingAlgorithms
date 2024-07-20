package org.BinaryTrees;

public class Sorting {
    public int[] array;
    private int length;

    public Sorting(int size) {
        array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        length = size;
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
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0 && array[j] < array[j - 1]; j--) {
                swap(j - 1, j);
            }
        }
    }

    public void shellSort() {
        for (int step = length/2; step > 0; step /= 2) {
            for (int i = step; i < length; i++) {
                for (int j = i - step; j >= 0 && array[j] > array[j+step]; j -= step) {
                    swap(j, j + step);
                }
            }
        }
    }

    public void heapSort() {
        for (int i = length / 2 - 1; i >= 0; i--)
            heapIfy(length, i);
        for (int i = length - 1; i >= 0; i--) {
            swap(0, i);
            heapIfy(i,0);
        }
    }

    private void heapIfy(int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && array[left] > array[largest])
            largest = left;
        if (right < n && array[right] > array[largest])
            largest = right;
        if (largest != i) {
            swap(i, largest);
            heapIfy(n, largest);
        }
    }

    public void quickSort() {
        quickSort(array, 0, length - 1);
    }

    private void quickSort(int a[], int first, int last) {
        if (first < last) {
            int left = first;
            int right = last;
            int middle = a[(left + right) / 2];
            do {
                while (a[left] < middle)
                    left++;
                while (a[right] > middle)
                    right--;
                if (left <= right) {
                    swap(left, right);
                    left++;
                    right--;
                }
            } while (left <= right);
            quickSort(a, first, right);
            quickSort(a, left, last);
        }
    }
}
