package oops;

public class inheritance {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

class oper{
    public static void main(String[] args){
    inheritance obj=new inheritance();

    int r1=obj.add(1,2);
    int r2=obj.sub(5,5);
    System.out.println(r1);
    System.out.println(r2);
}}