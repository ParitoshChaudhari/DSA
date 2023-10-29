import java.util.Scanner;

public class Question_15_Reverse_Letter_Triangle {
    public static void main(String[] args) {
        //Question
        // https://www.codingninjas.com/studio/problems/reverse-letter-triangle_6581906

        //input
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();

        //output
        for(int col=n;col>=1;col--){
            char ch = 'A';
            for(int row=col;row>=1;row--){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println("");
        }
    }
}

//Accepted submission
// public class Solution {
//     public static void nLetterTriangle(int n) {
//         // Write your code here
//         for(int col=n;col>=1;col--){
//             char ch = 'A';
//             for(int row=col;row>=1;row--){
//                 System.out.print(ch+" ");
//                 ch++;
//             }
//             System.out.println("");
//         }
//     }
// }

