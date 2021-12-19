package com.cherevataya;

import java.util.Arrays;

public class IntList {
    private int[] arr = new int[0];

    public void add(int value) {
        int[] temporaryArray = new int[arr.length + 1];
        System.arraycopy(arr, 0, temporaryArray, 0, arr.length);
        temporaryArray[temporaryArray.length - 1] = value;
        arr = temporaryArray;
    }

    public int get(int index) {
        return arr[index];
        // return 0;
    }

    public void set(int index, int value) {
        arr[index] = value;
    }

    public int size() {
        return arr.length;
        //return 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
        // return "";
    }
}
