public class Interface{
    public static void main(String[] args) {
//         Queen q = new Queen();
//         q.moves();
//     }
// }

// interface ChessPlayer{
//     void moves();
// }

// class Queen implements ChessPlayer{
//     public void moves(){
//         System.out.println("Up, Down, left, right, diagonal(in all 4 direction)");
// }
// }

// class Rook implements ChessPlayer{
//     public void moves(){
//         System.out.println("Up, Down, left, right");
//     }
// }

// class King implements ChessPlayer{
//     public void moves(){
//         System.out.println("Up, Down, left, right, diagonal(in all 4 direction)");
//     }
// }

       //static keywordds...
//        Student s1 = new Student();
//        s1.schoolName = "JVM";
       
//        Student s2  = new Student();
//        System.out.println(s2.schoolName);
       
//        Student s3  = new Student();
//        s3.schoolName = "ABC";

//     }
//     }
//  class Student{
//     String name;
//     int roll;

//     static String schoolName;

//     void setName(String name){
//         this.name = name;
//     }
// String getName(){
//     return name;
// }

//  }



//super keyword....
Horse h = new Horse();
System.out.println(h.color);
    }
}
class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor is called");
    }
}
class Horse extends Animal{
Horse(){
    // super();
    System.out.println("Horse constructor is called");
}
}
