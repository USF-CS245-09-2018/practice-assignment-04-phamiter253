public class BubbleSort implements SortingAlgorithm{

    public void swap(int a, int b, int [] arr){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public void sort(int [] a){
        boolean swapped = true;
        while(swapped){
            swapped = false;
            for(int i = 0; i < a.length -1; i++){
                if(a[i] > a[i+1]){
                    swap(i,i+1,a);
                    swapped = true;
                }
            }
        }
    }
}