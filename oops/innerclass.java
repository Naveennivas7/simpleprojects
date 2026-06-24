package oops;


class outer{
    int a=5;

    class inner{
        int b=10;
    }
}
public class innerclass {
    public static void main (String[]args){

        outer outerclass=new outer();
        outer.inner innerclass=outerclass.new inner();
        System.out.println(innerclass.b+outerclass.a);
    }
    
}
