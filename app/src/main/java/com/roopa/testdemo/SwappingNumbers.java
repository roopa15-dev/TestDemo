package com.roopa.testdemo;

import java.util.Collection;
import java.util.Collections;

public class SwappingNumbers {

    int temp=0;
    private void swap(int[] arr,int i,int j){
        temp= arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private void swapwithouttemp(int[] arr,int i,int j){
        
    }
}

