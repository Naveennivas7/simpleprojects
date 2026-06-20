public class mathproblems {
    public static void main(String[] args){
        int x=10;
        int y=30;
        double z=Math.sqrt(x);
        double w=-7.5;
        System.out.println("maximum value:"+Math.max(x,y));
        System.out.println("minimum value:"+Math.min(x,y));
        System.out.println("square root value:"+z);
        System.out.println("absolute value:"+Math.abs(w));
        System.out.println("power:"+ Math.pow(2,2));
        System.out.println("roundof:"+Math.round(2.6));
        System.out.println("rouding using ceil method:"+Math.ceil(2.1));//rounds up (returns the smallest integer greater than or equal to x)
        System.out.println("rounding with floor:"+Math.floor(2.1));//rounds down (returns the largest integer less than or equal to x)
         System.out.println("random number:"+Math.random());// returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
    }
    
}
