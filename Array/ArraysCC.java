import java.util.*;
public class ArraysCC{
    public static void main(String args[]){
        int marks[] = new int[100];
         Scanner sc = new Scanner(System.in);
        
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        marks[3]=sc.nextInt();
        
        System.out.println("phy:" + marks[0]);
        System.out.println("chem:" + marks[1]);
        System.out.println("math:" + marks[2]);
        System.out.print("hin:" + marks[3]);
    
        int percentage = (marks[0]+marks[1]+marks[2]+marks[3]) / 4;
        System.out.println("percentage: = " + percentage + "%");
    }
}
