package com.company;

public class BinarySearch {
    // return index of x if it is present in arr[l, r], else return -1
    int binarySearch(int arr[], int left, int right, int x){
        if(right >= left){
            int mid = left + (right-left) / 2;

            // If the element is present at the middle itself
            if(arr[mid] == x){
                return mid;
            }
            // If element is smaller than mid, then it can only be present in left subarray
            if(arr[mid] > x){
                return binarySearch(arr, left, mid -1, x);
            }
            // Lese the element can only be present in right subarray
            return binarySearch(arr, mid + 1, right, x);
        }
        // We reach here when element is not present in array
        return -1;
    }
}
