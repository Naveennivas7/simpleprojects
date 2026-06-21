public class logicaloperator {
    public static void main(String[] args){
        int a=200;
        int b=33;
        int c=500;
        if(a>b && b>a && c>a){
            System.out.println("both conditions are true");

        }
        // else if(a>b || b>a){
        //     System.out.println("any one condition true this block will be executed");
        // }
        else if(!(a<b)){
            System.out.println("this will reverse the condition wether the condion is true it will return as false");
        }
    }
    
}
