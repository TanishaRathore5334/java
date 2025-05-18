public class OOPS{
    public static void main(String[]args){
//          Pen p1 =new Pen(); //created a pen object called p1
//          p1.setColor("blue");
//          System.out.println(p1.color);
//             p1.setTip(5);
//             System.out.println(p1.tip);

//              BankAccount myAcc = new BankAccount();
//              myAcc.username = "tansharathore";
//              myAcc.setPassword("abcdef");
      

//     }
// }

  // class BankAccount{
  //   public String username;
  //   private String password;
  //   public void setPassword(String pwd){
  //       password = pwd;
  //   }
  // }

  //   class Pen {
  //       String color;
  //       int tip;

  //        void setColor(String newColor) {
  //           color = newColor;
  //        }
  //        void setTip(int newTip){
  //           tip = newTip;
  //        }
  //     }

  //  class Student{
  //   String name;
  //   int age;
  //   float percentage;  //cgpa
  //   void calcPercentage(int phy, int chem, int math){
  //       percentage = (phy + chem + math) / 3.0f;
  //   }
  //  }




   Student s1 = new Student();
   Student s2 = new Student("Tanisha");
   Student s3 = new Student(123);
  //  Student s4 = new Student("Tanisha");


      //  System.out.println(s1.name);
       }
             }
        
        class Student{
          String name;
          int roll;

          // Student(String name){
          //   this.name = name;

          Student(){
            System.out.println("constructor is called...");
          }
          Student(String name){
            this.name = name;
          }
          Student(int roll){
            this.roll = roll;
          }
          }
        