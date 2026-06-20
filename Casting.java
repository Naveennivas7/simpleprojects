public class Casting {
    public static void main(String[] args){

        //widening casting

        byte a=10;
        System.out.println(a);
        short b=a;
        System.out.println(b);
        int c=b;
        System.out.println(c);
        long d=c;
        System.out.println(d);
        float e=d;
        System.out.println(e);
        double f=e;
      System.out.println(f);




      //narrowing casting

      double mydouble=12.33;
      float myfloat=(float) mydouble;
      System.out.println(myfloat);
      long mylong=(long) myfloat;
      System.out.println(mylong);
      int myint=(int) mylong;
      System.out.println(myint);
      



        
    }
    
}
