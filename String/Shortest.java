import java.util.*;
public class Shortest{
//     public static float shortestPath(String path){
//         int x=0, y=0;

//         for(int i=0;i<path.length();i++){
//       char dir = path.charAt(i);
//       //south
//       if(dir=='S'){
//         y--;
//       }
//       //north
//       else if(dir=='N'){
//         y++;
//         }
//         //west
//         else if(dir=='W'){
//             x--;
//         }
//         //east
//         else {
//             x++;
//         }
//     }

//     int X2 = x*x;
//     int Y2 = y*y;
//     return (float)Math.sqrt(X2+Y2);
// }
// public static void main(String[] args) {
//     String path = "WNEENESENNN";
//     System.out.println(shortestPath(path));
// }
// }


//substring...
// public static String substring(String str, int si, int ei) {
//     String substr = "";
//     for(int i=si; i<ei; i++){
//         substr += str.charAt(i);
//     }
//     return substr;
// }
 
// public static void main(String [] args) {
//     String str = "HelloWorld";
//     System.out.println(substring(str, 0, 5));
// }
// }



//print largest string..
// public static void main(String args[]){
//     String fruits[] = {"apple","mango","banana"};
//     String largest = fruits[0];
//     for(int i=1; i<fruits.length; i++){
//      if(largest.compareTo(fruits[i]) < 0){
//         largest = fruits[i];
//      }
//      }

//      System.out.println(largest);

//     }
// }



// public static void main(String args[]){
// StringBuilder sb = new StringBuilder("");
// for(char ch='a'; ch<='z'; ch++){
//     sb.append(ch);
// }
// //abcdefghijklmnopqrstuvwxyz..
// //0{26}
// System.out.println(sb);
// }
// }




// public static String toUpperCase(String str){
//     StringBuilder sb = new StringBuilder("");

//     char ch = Character.toUpperCase(str.charAt(0));
//     sb.append(ch);
//     for(int i=1; i<str.length(); i++){
//         if(str.charAt(i) == ' ' && i<str.length()-1){
//             sb.append(str.charAt(i));
//             i++;
//             sb.append(Character.toUpperCase(str.charAt(i)));
//         }else{
//             sb.append(str.charAt(i));
//         }
//     }
//     return sb.toString();
// }

// public static void main(String args[]){
//     String str = "hi, i am tanisha";
//     System.out.println(toUpperCase(str));
// }
// }




public static String compress(String str){
        StringBuilder newStr = new StringBuilder();
        int count;

        for (int i = 0; i < str.length(); i++) {
            count = 1; // Reset count for each new character
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if (count > 1) {
                newStr.append(count);
            }
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        String str = "abdfhghuyytytyyytgvvfvy";
        System.out.println(compress(str)); // Expected output: "a2b3sd2c2"
    }
}
