public class Insertion{
    public static void InsertionSort(int arr[]){
    for(int turn=0; turn<arr.length-1; turn++){

            for(int j=0; j<arr.length-1; j++){
                if(arr[j]>arr[j+1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
                
        }
    }
public static void printArr(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
        }
        System.out.println();
        }

    public static void Insertion(int arr[]) {
        for(int i=0; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct pos to insert..
            while(prev>=0 && arr[prev]>arr[curr]){
                arr[prev+1] = arr[prev];
                prev--;
                    }
                    arr[prev+1] = arr[curr];
        }
    }
 
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        InsertionSort(arr);
        printArr(arr);
        }
    }