public class Abstract{
    public static void main(String[] args) {
         Horse h = new Horse();
         h.eat();
         h.walk();
          System.out.println(h.color);
             }
        }
          
         abstract class Animal{
            String color;

            Animal(){
                color = "brown";
            }
            void eat(){
                System.out.println(" animal Eats");
            }
            abstract void walk();
         }
         class Horse extends Animal{
            void changeColor(){
                color = "dark black";
            }
         void walk(){
            System.out.println("Horse is walking");
         }      
        }
  class Chicken extends Animal{
    void walk(){
        System.out.println("Chicken is walking");
    }
  }        
         

