public class SelectionSort implements SortingAlgorithm{
    public void swap(int a, int b, int [] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public int find_min(int pos, int [] arr){
        int min = pos;
        for(int k = pos + 1; k < arr.length; k++){
            if(arr[k] < arr[min]){
                min = k;
            }
        }
        return min;
    }
    public void sort(int [] a){
       for(int i = 0; i < a.length; i++){
           swap(i, find_min(i,a),a);
       }
    }
}