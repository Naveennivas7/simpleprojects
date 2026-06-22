public class methodwithreturntype {
    static int mymethod(int x){
        return 2*x;
        // return 5+x;
    }
    public static void main(String []args){
    //    int z=mymethod(2);
    //    System.out.println(z);

    for(int i=1;i<=5;i++){
        System.out.println("the double of the number  "+i+"  is  "+mymethod(i));
    }
    }
    
}
