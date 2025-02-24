class Solution {
    // Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[]) {
        for( int i = 0; i< arr.length-1; i++){
            for (int j =0; j<arr.length-1-i; j++){
                if (arr[j]> arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =  temp;
                }
            }
        }
    }
}

Outer Loop: The outer loop runs from 0 to n - 1, where n is the length of the array. This ensures that we make enough passes to sort the entire array.
Inner Loop: The inner loop runs from 0 to n - 1 - i, which means that with each pass, the largest unsorted element "bubbles up" to its correct position at the end of the array.