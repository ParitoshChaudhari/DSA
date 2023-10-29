import java.util.Scanner;

public class Question_6_Reverse_traingle {
    public static void main(String[] args) {
        //Question
        // https://www.codingninjas.com/studio/problems/reverse-number-triangle_6581889

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        for(int col=n;col>=1;col--){
            int num = 1;
            for(int row=col;row>=1;row--){
                System.out.print(num+" ");
                num++;
            }
            System.out.println(" ");
        }
    }
}


//Accepted solution
// public class Solution {
//     public static void nNumberTriangle(int n) {
//         // Write your code here
//         for(int col=n;col>=1;col--){
//             int num = 1;
//             for(int row=col;row>=1;row--){
//                 System.out.print(num+" ");
//                 num++;
//             }
//             System.out.println(" ");
//         }
//     }
// }