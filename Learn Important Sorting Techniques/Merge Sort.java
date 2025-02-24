lass Solution {
    void mergeSort(int arr[], int l, int r) {
        int low = l;
        int high = r;
        if(low>=high){
            return;
        }
        int mid = (low+high)/2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    void merge(int arr[], int low, int mid, int high){
        ArrayList <Integer> result = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(arr[left]<=arr[right]){
                result.add(arr[left]);
                left++;
            }
            else{
                result.add(arr[right]);
                right++;
            }
        }
        while(left<=mid){
            result.add(arr[left]);
            left++;
        }
        while(right<=high){
            result.add(arr[right]);
            right++;
        }
        for(int i=low;i<=high;i++){
            arr[i] = result.get(i-low);
        }
    }
}