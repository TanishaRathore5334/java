public class pattern{
  public static void main(String args[]){
    // for(int i=1;i<=4;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }


    //.........................
// int n=4;
    // for(int i=1;i<=9;i++){
    //     for(int j=1;j<=9-i+1;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }


     //.....................
    //  int n = 6;
//     for(int i=1;i<=9;i++){
//         for(int j=1;j<=i;j++){
//             System.out.print(j);
//         }
//         System.out.println();
//     }


int n = 6;
char ch = 'A';
    for(int i=1;i<=n;i++){
        for(int chars=1;chars<=i;chars++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }




 }
}

