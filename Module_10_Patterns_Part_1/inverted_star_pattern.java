import java.util.Scanner;

public class inverted_star_pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        for(int line=num;line>=0;line--){
            //column

            for(int star=1;star<=line;star++){
                // row
                System.out.print("*");
            }

            //line gap
            System.out.println(" ");
        }
    }
}
