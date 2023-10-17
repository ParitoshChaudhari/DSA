import java.util.Scanner;

public class half_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter num : ");
        int num = sc.nextInt();

        for(int line=1;line<=num;line++){
            //column

            for(int row=1;row<=line;row++){
                ///row
                System.out.print(row);
            }

            //line gap
            System.out.println(" ");
        }
    }
}
