import java.util.Scanner;

public class Question_14_Increasing_Letter_Triangle {
    public static void main(String[] args) {
        //question
        // https://www.codingninjas.com/studio/problems/increasing-letter-triangle_6581897

        //input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //output
        for(int col=1;col<=n;col++){
            char ch = 'A';
            for(int row=1;row<=col;row++){
                System.out.print(ch +" ");
                ch++;
            }
            System.out.println("");
        }
    }
}

//Accepted solution
// public class Solution {
//     public static void nLetterTriangle(int n) {
//         // Write your code here
//         for(int col=1;col<=n;col++){
//             char ch = 'A';
//             for(int row=1;row<=col;row++){
//                 System.out.print(ch +" ");
//                 ch++;
//             }
//             System.out.println("");
//         }
//     }
// }



