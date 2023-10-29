import java.util.Scanner;

public class Question_3_N_Traingles {
    public static void main(String[] args){
        //Question 
        // https://www.codingninjas.com/studio/problems/n-triangles_6573689

        //input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        //output
        for(int col = 1 ; col <= N ; col++){
            for(int row = 1; row <= col ; row++){
                System.out.print(row + " ");
            }
            System.out.println("");
        }
    }
}

//Accepted solution
// public class Solution {
//     public static void nTriangle(int n) {
//         // Write your code here

//         for(int col=1;col<=n;col++){
//             for(int row=1;row<=col;row++){
//                 System.out.print(row+" ");
//             }
//             System.out.println("");
//         }
//     }
// }
