import java.util.*;
public class calculator{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a");
        int a = sc.nextInt();
        System.out.println("enter b");
        int b = sc.nextInt();
       
        char operataor = sc.next().charAt(0);

        switch(operator){
            case'+' :  System.out.println(a+b);
          //  system.out.println(a+b);
            break;
            case'-' : System.out.println(a-b);
            //system.out.println(a-b);
            break;
            case'*' : System.out.println(a*b);
            //system.out.println(a*b);
            break;
            case'/' : System.out.println(a/b);
          //  system.out.println(a/b);
            break;
            case'%' : System.out.println(a%b);
        //    system.out.println(a%b);
            break;
            default: System.out.print(" its wrong operator");
            //system.out.print("wrong operator");
        

        }


    }
}
