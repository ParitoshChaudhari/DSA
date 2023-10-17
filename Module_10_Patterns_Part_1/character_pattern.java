import java.util.Scanner;

public class character_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Num : ");
        int num  = sc.nextInt();

        char alphabet = 'A';

        for(int line=1;line<=num;line++){
            //column

            for(int row=1;row<=line;row++){
                System.out.print(alphabet + " ");
                alphabet++; // increasing by one
            }

            //line gap
            System.out.println(" ");
        }
    }
}
