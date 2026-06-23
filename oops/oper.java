
package oops;

class advoper{
    public int mult(int n1,int n2){
        return n1*n2;
    }

    public int div(int n1,int n2){
        return n1/n2;
    }
}

class inheritance extends advoper{
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

public class oper{
    public static void main(String[] args){
        inheritance obj=new inheritance();

        int r1=obj.add(1,2);
        int r2=obj.sub(5,5);
        int r3=obj.mult(5,5);
        int r4=obj.div(5,5);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}