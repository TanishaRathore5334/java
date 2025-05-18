public class sum{
    public static void main(String args[]){
        int a=23;
        int b=34;
        int sum=a+b;
        System.out.println(sum);
    }
}



class Solution {
    static void rotateArr(int arr[], int d) {
        int n = arr.length;
    for (int i = 0; i < d; i++) {
      
        int first =arr[0];
        for (int j =0; j < n - 1; j++) {
            arr[j] =arr[j+1];
        }
        arr[n-1] = first;
    }
}
public static void main(String[] args) {
    int[] arr = {2,4, 6, 8 };
    int d = 2;
    rotateArr(arr, d);
    for (int i = 0; i < arr.length; i++)
        System.out.print(arr[i] + " ");
}
}







int n = arr.length;
int i = n - 2;
while (i >= 0 && arr[i] >= arr[i + 1]) {
    i--;
}
if (i < 0) {
    reverse(arr, 0, n - 1);
    return;
}
int j = n - 1;
while (arr[j] <= arr[i]) {
    j--;
}
swap(arr, i, j);
reverse(arr, i + 1, n - 1);
}
private static void swap(int[] arr, int i, int j) {
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
private static void reverse(int[] arr, int start, int end) {
while (start < end) {
    swap(arr, start++, end--);
}
}
public static void main(String[] args) {
int[] arr1 = {2, 4, 1, 7, 5, 0};
nextPermutation(arr1);
System.out.println(Arrays.toString(arr1)); 

int[] arr2 = {3, 2, 1};
nextPermutation(arr2);
System.out.println(Arrays.toString(arr2)); 

int[] arr3 = {3, 4, 2, 5, 1};
nextPermutation(arr3);
System.out.println(Arrays.toString(arr3));
}
}
