import java.util.Scanner;

public class Question_5_Seeding {
    public static void main(String[] args) {
        //Question
        // https://www.codingninjas.com/studio/problems/seeding_6581892

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //output
        for(int col=n;col>=1;col--){
            for(int row=col;row>=1;row--){
                System.out.print("*"+" ");
            }
            System.out.println("");
        }
    }
}


//Accepted Solution
// public class Solution {
//     public static void seeding(int n) {
//         // Write your code here
//         for(int col=n;col>=1;col--){
//             for(int row=col;row>=1;row--){
//                 System.out.print("*"+" ");
//             }
//             System.out.println("");
//         }
//     }
// }