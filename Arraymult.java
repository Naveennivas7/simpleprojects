
import java.util.Scanner;

public class Arraymult {

    public static void main(String[] args) {
        // int[][] num = { { 1, 2, 3 }, { 4, 5, 6 } };

        // runnig each element

        // for (int i = 0; i < num.length; i++) {
        // for (int j = 0; j < num[i].length; j++) {
        // System.out.println(num[i][j]);
        // }
        // }

        // running in for each loop

        // for (int[] row: num) {
        // for (int number : row) {
        // System.out.println(number);
        // }
        // }

        // multidimentional array
        // int[][] num=new int[3][3];

        // int [][] num={
        // {1,2,3},
        // {4,5,6},
        // {7,8,9}

        // }

        // }







        // Scanner sc = new Scanner(System.in);

        // int[][] num = new int[3][3];
        // System.out.println(num.length);// number of rows

        // for (int row = 0; row < num.length; row++) {

        //     for (int col = 0; col < num[row].length; col++) {
        //         num[row][col] = sc.nextInt();
        //     }
        // }

        // for (int row = 0; row < num.length; row++) {

        //     for (int col = 0; col < num[row].length; col++) {
        //         System.out.print(num[row][col] + " ");
        //     }
        //     System.out.println();
        // }
        // sc.close();











        int[][] num = { { 1, 2, 3 },
                        { 4, 5, 6,7,8,9 } ,
                        { 10, 11, 12 } };
        for (int i = 0; i < num.length; i++) 
            {
                for (int j = 0; j < num[i].length; j++) {
                    System.out.print(num[i][j] + " ");
                }
                System.out.println();
            }




    }
    }