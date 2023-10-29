import java.util.Scanner;

public class Question_1_N_Forest{
    public static void main(String[] args){

        // Question
        // https://www.codingninjas.com/studio/problems/n-forest_6570177

        //Input 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        //output 
        for(int col=1;col<=N;col++){
            for(int row=1;row<=N;row++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}




// Accepted solution

// public class Solution {
//     public static void nForest(int n) {
//         // Write your code here

//         for(int col=1;col<=n;col++){
//             for(int row=1;row<=n;row++){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//     }
// }