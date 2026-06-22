import java.util.ArrayList;
import java.util.Scanner;


public class Arraylistexample {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();





        // list.add(1);
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(5);



        // for(int i=0;i<list.size();i++){
        //     System.out.println(list.get(i));
        // }



        for(int i=0;i<5;i++){
         list.add(s.nextInt());

        }
System.out.println(list);

s.close();
    }
}