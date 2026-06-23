package oops;
public class constructorexp {
  int x=5;
    public constructorexp(int y){
        x=y;
        
    }
    public static void main(String[]args){
        constructorexp myobj=new constructorexp(4);
        System.out.println(myobj.x);
        
    }
    
}
