package com.yiyang.strategy.comparator;

public class Sorter<T> {

    public void sort(T[] arr, Comparator<T> comparator) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                minIndex = comparator.compare(arr[minIndex], arr[j]) < 0 ? minIndex : j;
            }
            swap(arr, minIndex, i);
        }
    }

    private void swap(T[] arr, int a, int b) {
        T temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
