// Basic Star Pattern

import java.util.*;

public class star_pattern{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int num = sc.nextInt();

        for(int line=1;line<=num;line++){
            //column

            for(int star=1;star<=line;star++){
                //row
                System.out.print("*");
            }

            //one line gap
            System.out.println(" ");
        }
    }
}