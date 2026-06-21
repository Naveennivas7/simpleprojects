public class methodwithifelse {
    static void voter(int age){
        if(age>=18){
            System.out.println("you are eligible for vote");
        }
        else{
            System.out.println("you are not eligible for vote");
        }
    }

    public static void main(String[]args){
        voter(22);
    }
    
}
