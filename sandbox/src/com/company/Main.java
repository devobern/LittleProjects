package com.company;

public class Main {

    public static void main(String[] args) {
        // Binary Search
        BinarySearch ob = new BinarySearch();
        int arr[][] = {{1,2}, {3,4}, {5,6}, {40,10}};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if(result == -1){
            System.out.println("Element not present");
        }else{
            System.out.println("Element preset at index " + result);
        }
    }
}
