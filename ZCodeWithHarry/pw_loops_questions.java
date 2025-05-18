import java.util.Scanner;
//public class pw_loops_questions {
//    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
//         int n = sc.nextInt();
//         int numOfDigits=0;
//         int original_n = n;
//
//         while(n>0){
//             n=n/10;
//             numOfDigits++;  //numOFDigits = numOfDigits + 1
//         }
//        System.out.println("Number of digits in" + original_n + " = " + numOfDigits);
//         }
//
//
//
//    }



// question 2
public class pw_loops_questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // int n = sc.nextInt();
//        int sumOfDigits=0;
//        int original_n = n;
//
//        while(n>0){
//
//            sumOfDigits +=n%10;
//            n=n/10;
//        }
//        System.out.println("Sum of digits in" + original_n + " = " + sumOfDigits);
//    }
//   }
//
//
//


        //question 3
//        int ans = 0;
//        while (n > 0) {
//            ans = ans * 10 + n % 10;
//            n /= 10;
//            System.out.println(ans);
//        }


        //question 4
//        int ans = 0;
//        for (int i =1; i<=n; i++){
//            if(i%2==0){
//                ans -=i;
//            }
//            else{
//                ans +=i;
//            }
//        }
//        System.out.println(ans);
//


        //question 5
//        int fact = 1;
//        for (int i = 1; i<=n; i++){
//            fact = fact * i;
//            System.out.println("factorial of " + i + " : " + fact);
//        }


        //question 6
        int a = sc.nextInt(),b = sc.nextInt();
         int ans =1;
         for(int i=1; i<=b; i++){
            ans *= a;
        }
            System.out.println(ans);

    }
}





