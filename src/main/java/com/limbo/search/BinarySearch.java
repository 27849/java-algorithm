package com.limbo.search;


/**
 * 二分查找
 *
 * @author limbo
 **/
public class BinarySearch {


    public static int rank(int key, int[] array) {
        int low = 0;
        int high = array.length - 1;
        int mid;
        while (low <= high) {
            mid = low + (high - low) / 2;
            if (key < array[mid]) {
                high = mid - 1;
                continue;
            }
            if (key > array[mid]) {
                low = mid + 1;
                continue;
            }
            return mid;
        }
        return -1;
    }
}
