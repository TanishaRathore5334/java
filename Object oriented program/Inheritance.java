public class Inheritance{
    public static void main(String[] args) {
    //  Fish shark  = new Fish();
    //  shark.eat();
    Dog baby = new Dog();
    baby.eat();
    baby.legs = 4;
    System.out.println(baby.legs);

         }
       }
          //base class
       class Animal{
        String color;

        void eat(){
            System.out.println("Eating");
        }
        void breathe(){
            System.out.println("Breathe");
        }
       }

       class Mammal extends Animal{
        int legs;
        }
         
        class Dog extends Mammal{
            String breed;
        }
    //    //derived class
    //    class Fish extends Animal{
    //     int fins;

    //     void swim(){
    //         System.out.println("Swimming");
    //     }
    // }