import java.util.*;
public class BitManipulation{
    public static void oddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask)==0){
            //even number.
            System.out.println(n + " is even.");
        } else{
            System.out.println("odd number");
        }
        }
        // public static void main(String args[]){
        //     oddOrEven(10);
        //     oddOrEven(5);
        //     oddOrEven(1);

    // }
        // }
    



    //getbit..
    // public static int getIthBit(int n, int i){
    //     int bitMask = 1 << i;
    //     if((n&bitMask) == 0){
    //         return 0;
    //     }
    //     else{
    //         return 1;
    //     }
    // }
//     public static void main(String args[]){
//     System.out.println(getIthBit(10,2));
// }
// }




//setbit...
// public static int setIthBit(int n, int i){
//     int bitMask = 1 << i;
//     return n | bitMask;
// }
//     public static void main(String args[]){
//         System.out.println(setIthBit(10,2));
//     }
// }



//is power of two................

// public static boolean isPowerOfTwo(int n){
//     return (n&(n-1)) == 0;
//    }

//    public static void main(String args[]){
//     System.out.println(isPowerOfTwo(8));
//    }
// }




//clear bit.........

// public static int clearIthBit(int n, int i){
//     int bitMask = (~0)<<i;
//     return n&bitMask;
// }
//     public static void main(String args[]){
//         System.out.println(clearIthBit(10,2));
//     }
// }

 


//count set bits........
// public static int countSetBits(int n){
//     int count = 0;
//     while(n>0){
//         if((n&1) != 0){  //check our lsb
//             count++;
//         }
//        n =  n>>1;
//     }
// return count;
// }
// public static void main(String args[]){
//     System.out.println(countSetBits(16));
// }
// }



// public static int fastExpo(int a, int n){
//     int ans =1;
//     while(n>0){
//         if((n&1) != 0){  //check our lsb
//             ans = ans*a;
//             }
//             a = a*a;
//             n = n>>1;
//         }
//             return ans;
//     }
//     public static void main(String args[]){
//         System.out.println(fastExpo(5,3));
//     }

// }





//practice question....
// public static void main(String[] args){
//     int x=3, y=4;
//     System.out.println("Before swap: x="+ x +" and y =" + y);
//     //swap using xor
//     x = x^y;
//     y = x^y;
//     x=x^y;
//     System.out.println("After swap: x="+ x +" and y =" + y);
// }
// }






// public static void main(String[]args){
//     int x=6;
//     System.out.println(x + " + " + 1 +" is " +-~x);
//     x=-4;
//     System.out.println(x + " + " + 1 +" is " +-~x);
//     x=0;
//     System.out.println(x + " + " + 1 +" is " +-~x);
// }
// }   





public static void main(String[]args){
//convert uppercase character to lowercase
for(char ch = 'A'; ch <= 'Z'; ch++){
    System.out.println(ch + " in lowercase is " + (char)(ch+32));
}
}
}
