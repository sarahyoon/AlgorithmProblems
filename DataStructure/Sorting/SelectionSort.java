package Sorting;

public class SelectionSort {
    public static void main(String[] args){

        int[] arr = {64, 25, 12, 22, 11};
        int min =0;

        for(int i=0;i<arr.length;i++){
            min = arr[i];
            int tempIdx = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[tempIdx]>arr[j]){
                    tempIdx = j;
                }
            }
            //swap
            int swap = arr[i];
            arr[i] = arr[tempIdx];
            arr[tempIdx] = swap;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + ", ");
        }
    }
}
