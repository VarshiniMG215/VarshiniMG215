class Solution {
    public List<Integer> targetIndices(int[] arr, int target) {
        quicksort(arr , 0, arr.length-1);

List<Integer> list = new ArrayList<>();

     for(int i=0;i<arr.length;i++){
        if(arr[i]==target){
            list.add(i);
        }
     }
     return list;

}
    
static void quicksort(int arr[], int low, int high) {
    if (low < high) {
        int p = partition(arr, low, high);

        quicksort(arr, low, p - 1);
        quicksort(arr, p + 1, high);
    }
}

static int partition(int arr[], int low, int high) {
    int i = low - 1;
    int pivot = arr[high];

    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;

    return i + 1;
}

}