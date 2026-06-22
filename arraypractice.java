import java.util.Scanner;

public class arraypractice {
    public static void main(String[] args) {
        // String[] cars = { "volvo", "bmw", "ford", "mazada" };
        // System.out.println(cars[0]);
        // int[] num={1,2,3,4,5};
        // num[0]=20;
        // int sum=0;
       
        // for(int numbers:num){
            // sum+=num[i];
            // System.out.println(num[i]);
            // System.out.println(numbers);


            // int avg,sum=0;
            // int length=num.length;
            // for(int sum1:num){
            //     sum+=sum1;
               
            // }
            //  avg=sum/length;
            //     System.out.println("average is:"+avg);







            //finding the lowest age in an array
            // int[] age={12,13,34,8,45};
            // int lowest=age[0];
            // for (int i=0; i<age.length;i++){
            //     if (age[i]<lowest){
            //         lowest=age[i];

            //     }
            // }
            // System.out.println("lowest age is "+lowest);

            // Create a program with a list of numbers where you want to skip negative values, but stop completely if you find a zero:

           
            

            // Create a program that keeps track of the highest and lowest values in an array:
           
            



           
//             String[] seats = {"Jenny", "Liam", "Angie", "Bo"};

// for (int i = 0; i < seats.length; i++) {
//   System.out.println("Seat number " + i + " is taken by " + seats[i]);
// }







Scanner sc=new Scanner(System.in);
int[] num=new int[5];

for(int i=0;i<num.length;i++){
    System.out.println("enter a number");
    num[i]=sc.nextInt();
}
for(int i=0;i<num.length;i++){
    System.out.println(num[i]);
}
sc.close();

            }
        }
        // System.out.println("Sum: " + sum);
    
