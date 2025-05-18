import java.util.*;

public class CallByValue{
    public static void printHelloWorld(){         
    }
            public static int calculateSum(int num1, int num2 ) { //parameter or formal parameter;
                int sum = num1+num2;
                return sum;
        }
  
        // public static void main(String args[]){
        //     //swap - values exchanges
        //     int a=5;
        //     int b=10;

        //     //swap
        //     int temp = a;
        //     a = b;
        //     b = temp;
        //     System.out.println("a = " + a);
        //     System.out.println("b = " + b);

        // }
        // }

//product of a and b.................
        // public static int multiply(int a, int b){
        //    int product = a*b;
        //    return product;
        // }
        // public static void main(String args[]){
        //     int a=3;
        //     int b=5;
        //     int prod = multiply(a,b);
        //     System.out.println("a * b =" + prod);
        //     multiply(10,20);

        // }
        // }



        //factorial..........
        //  public static int factorial(int n){
        //     int f=1;
        
        //     for(int i=1;i<=n;i++){
        //         f=f*i;
        //     }
        //     return f;
        // }
        //      public static void main(String args[]){
        //      System.out.println(factorial(7));
            
        //  }
        //  }



          //check prime or not...........
         public static boolean isPrime(int n){
            // boolean isPrime = true;
                    for(int i=2;i<=n-1;i++){
                if(n%i==0) { //completely dividing
                    // isPrime = false;
                    // break;
                    return false;
                }
            }
            // return isPrime;
            return true;

        }
        //      public static void main(String args[]){
        //      System.out.println(isPrime(12));
            
        //  }
        //  }




        // public static void primesInRange(int n){
        //           for(int i=2;i<=n;i++){
        //                  if(isPrime(i)) {
        //                 System.out.print(i+" ");
        //              }
        //                 }
        //            System.out.println();
        // }
        //      public static void main(String args[]){
        //      primesInRange(12);
            
        //  }
        //  }



         //binarytodecimal..........
         public static void binToDec(int binNum){
            int myNum = binNum;
            int pow = 0;
            int decNum = 0;
            while(binNum>0){
                int lastDigit = binNum%10;
                decNum += lastDigit * (int)Math.pow(2,pow); 
                pow++;
                binNum = binNum/10;
            }
            System.out.println("decimal of " + myNum +" =" + decNum);
         }

        //  public static void main(String args[]){
        //     binToDec(111110);
        //  }
        // }


        //decimaltobinary.........
        public static void decToBin(int n){
            int myNum = n;
            int pow = 0;
            int binNum = 0;
            while(n>0){
                int rem = n%2;
                binNum = binNum + (rem*(int)Math.pow(10,pow));
                pow++;
                n= n / 2;
                }
                System.out.println("binary of " + myNum +" =" + binNum);
                }
                public static void main(String args[]){
                    decToBin(10);
                    }
                }