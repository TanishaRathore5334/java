import java.util.*;
public class Strings{
public static void printLetters(String str){
    for(int i=0;i<str.length();i++){
        System.out.print(str.charAt(i)+" ");
    }
System.out.println();
}

    public static void main(String[] args){
    //     char arr[] = {'a','b','c','d'};
    //     String str = "abcd";
    //     String str2 = new String("xyz");

    //    //strings are immutable in java
    //    Scanner sc = new Scanner(System.in);
    //   String name;
    //   name = sc.nextLine();
    //   System.out.println(name);



//string length....
//    String fullName = "Tanishaaa Rathore";
//    System.out.println(fullName.length());


           //concatenation....

        String name = "Twinklee";
        String surname = "Rathore";
        // String full = name + surname;
        // System.out.println(full);
        String fullName = name + " " + surname;

    printLetters(fullName);

    }
             
         }



         
