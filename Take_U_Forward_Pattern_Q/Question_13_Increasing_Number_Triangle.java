import java.util.Scanner;

public class Question_13_Increasing_Number_Triangle {
    public static void main(String[] args) {
        //Question
        // https://www.codingninjas.com/studio/problems/increasing-number-triangle_6581893

        //input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count=1;
        for(int col=1;col<=n;col++){
            for(int row=1;row<=col;row++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println("");
        }
    }
}


//Accepted solution 
// public class Solution {
//     public static void nNumberTriangle(int n) {
//         // Write your code here
//          int count=1;
//         for(int col=1;col<=n;col++){
//             for(int row=1;row<=col;row++){
//                 System.out.print(count+" ");
//                 count++;
//             }
//             System.out.println("");
//         }
//     }
// }