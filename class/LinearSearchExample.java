package krishna_proj;
 import java.util.Scanner;
public class LinearSearchExample {
    public static int LinearSearch(int array[],int x) {
        int n=array.length;
        for(int i=0;i<n;i++){
            if(array[i] == x)
            return i;
            }
            return -1;
            
        }
        public static void main(String[]args){
            int array[]={2,4,0,1,9};
            int x=1;
            int result =LinearSearch(array,x);
            if(result==-1)
            System.out.println("element not found");
            else
            System.out.println("element found at index:" +result);
            
        }
}