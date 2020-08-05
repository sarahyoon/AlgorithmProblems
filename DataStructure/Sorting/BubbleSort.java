package Sorting;

public class BubbleSort {

    public static void main(String[] args){
        int[] arr = {64, 25, 12, 22, 11};

        int startIdx = 0;

        while(startIdx<arr.length){
            for(int i=0;i<arr.length-1;i++){
                if(arr[i] > arr[i+1]){
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
            startIdx++;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + ", ");
        }
    }
}
