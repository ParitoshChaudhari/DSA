import java.util.Scanner;

public class product_of_two{

    public static int multiply(int a, int b){
        return (a*b);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b  = sc.nextInt();

        int product = multiply(a,b);
        System.out.println("The product of two number is : " +product);
    }
}