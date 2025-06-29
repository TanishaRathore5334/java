import java.util.*;

// public class Bubble{
//     public static void bubbleSort(int arr[]){
//         for(int turn=0; turn<arr.length-1; turn++){
//             for(int j=0; j<arr.length-1; j++){
//                 if(arr[j]>arr[j+1]){
//                     //swap
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
        
//                 }
//         }
//     }
    public static void printArr(int arr[]) {
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,2,8,69,98};
        bubbleSort(arr);
        printArr(arr);
        }
    }




