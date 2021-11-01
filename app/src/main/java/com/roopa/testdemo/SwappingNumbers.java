package com.roopa.testdemo;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SwappingNumbers {

    int temp=0;
    private void swap(int[] arr,int i,int j){
        temp= arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private void swapwithouttemp(List<Integer> arr, int i, int j){
        Collections.swap(arr,i,j);
    }
}

