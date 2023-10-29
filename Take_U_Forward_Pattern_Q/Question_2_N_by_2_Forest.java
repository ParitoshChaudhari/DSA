import java.util.Scanner;

public class Question_2_N_by_Forest{
    public static void main(String[] args){
        //Question
        // https://www.codingninjas.com/studio/problems/n-2-forest_6570178

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int col=1;col<=N;col++){
            for(int row=1;row<=col;row++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}


// Accepted solution

// public class Solution {
//     public static void nForest(int n) {
//         // Write your code here
//         for(int col=1;col<=n;col++){
//             for(int row=1;row<=col;row++){
//                 System.out.print("* ");
//             }
//             System.out.println("");
//         }
//     }
// }