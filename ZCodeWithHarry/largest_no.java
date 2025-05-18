import java.sql.SQLOutput;
import java.util.Scanner;
public class largest_no {
    public static void main(String[] args) {
      Scanner sc =  new Scanner(System.in);
      int A =11,B =3, C =9;

      if ((A>=B) && (B>=C)) {
          System.out.println("largest A");
                }
      else if(A>=C){
          System.out.println("largest B");
                }
      else {
          System.out.println("largest c");
      }
    }
}
