import java.util.Scanner;

public class sumoftwonumbers {


    

    public static void main(String[] args) {

        // take the input of two numbers and print the sum of two numbers

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first number:");
        int a = sc.nextInt();
        System.out.println("enter the second number:");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("the sum of the two numbers is:" + sum);
sc.close();
    }
    
}
