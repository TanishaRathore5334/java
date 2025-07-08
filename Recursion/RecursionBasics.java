public class RecursionBasics {
//     public static void printDec(int n){
//         if (n==1){
//             System.out.println(n);
//             return;
//         }
//         System.out.print(n+" ");
//         printDec(n - 1);
//     }
// //     public static void main(String[] args) {
//         int n = 10;
//         printDec(n);
// }
// }


//factorial...
// public static int fact(int n){
//     if(n == 0){
//         return 1;
//         }
//         int fnm1 = fact(n-1);
//         int fn = n*fact(n-1);
//         return fn;
//         }
    //     public static void main(String[]args){
    //         int n = 151;
    //         System.out.println( fact(n));
    //     }
    // }


    //first n natural no...
    // public static int calSum(int n){
    //     if( n == 1){
    //         return 1;
    //     }
    //     int Snm1 = calSum(n-1);
    //     int Sn = n+Snm1;
    //     return Sn;
    // }
    // public static void main(String args[]){
    //     int n =7;
    //     System.out.println(calSum(n));
    // }
    // }


    //nth term in fibbonacci........
//     public static int fib(int n) {
//         if(n == 0 || n==1){
//             return n;
//         }
//         int fnm1 = fib(n-1);
//         int fnm2 = fib(n-2);
//         int fn = fnm1 + fnm2;
//         return fn;
//     }

//     public static void main(String args[]){
//         int n = 25;
//         System.out.println(fib(n));
//     }
// }



//is sorted or not..........
// public boolean isSorted(int arr[], int i){
//     if(i == arr.length-1){
//         return true;
//     }
//     if(arr[i] > arr[i+1]){
//         return false;
//             }
//     return isSorted(arr, i+1);
//         }
//      public static void main(String[] args){
//         int arr[] = {1,2,3,5,6};
//         System.out.println(isSorted(arr, 0));
//      }
//      }



//first occurence.......
// public static int firstOccurence(int arr[], int key, int i){
//     if(i == arr.length){
//         return -1;
//     }
//     if(arr[i] == key){
//         return i;
//     }
//     return firstOccurence(arr,key, i+1);
//     }

//     public static void main(String[]args){
//         int arr[] = {8,4,3,6,5,6,22,};
//        System.out.println(firstOccurence(arr,5,0));
//     }
      
//     }




//last occurence......
// public static int lastOccurence(int arr[], int key, int i){
//     if(i == arr.length){
//         return -1;
//     }
    
//         int isFound = lastOccurence(arr,key, i+1);
//         if(isFound == -1 && arr[i] == key){
//             return i;
//         }
    
//         return isFound;
//     }
//     public static void main(String[]args){
//         int arr[] = {5,5,5,5};
//        System.out.println(lastOccurence(arr,5,0));
//     }
      
//     }





       //power of x.......
    //    public static int power(int x, int n){
    //     if(n == 0){
    //         return 1;
    //     }
    //     return x*power(x,n-1);
    //    }
    //    public static void main(String args[]){
    //     System.out.println(power(9,3));
    //    }
    // }



    //last occourance..........
//     public static int optimizedPower(int a, int n){
//         if(n == 0){
//             return 1;
//         }
//         int halfPowerSq = optimizedPower(a,n/2) * optimizedPower(a,n/2);
      
//         //n is odd
//         if(n%2 == 1){
//             halfPowerSq = a*halfPowerSq;
//         }
//         return halfPowerSq;
//     }

//     public static void main(String args[]){
//         int a=2;
//         int n=5;
//         System.out.println(optimizedPower(a,n));
//     }
// }




//titling..............
public static int tilingProblem(int n){
    //base case
    if(n == 0 || n == 1){
        return 1;
    }
    //kaam
    //vertical choice
    int fnm1 = tilingProblem(n-1);
        //horizontal choice
        int fnm2 = tilingProblem(n-2);

        int totWays=fnm1+fnm2;
        return totWays;
    }

    public static void main(String args[]){
        System.out.print(tilingProblem(2));
    }

}
