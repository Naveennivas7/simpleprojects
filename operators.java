public class operators {



    // static void numbers(){
    //     int a=10;
    //     int b=20;

    //     System.out.println(a+b);

    // }
    // static void addition(){
    //     numbers();
        
    // }


    // public static void main(String []args){
    //     addition();

    
        //arithmetic operator
        //adition


        // int addition=a+b;
        // System.out.println(addition);






        static void arithmetic(int a,int b){
            System.out.println("addition: " + (a + b));
            System.out.println("subtraction: " + (a - b));
            System.out.println("multiplication: " + (a * b));
            System.out.println("division: " + (a / b));
            System.out.println("modulus: " + (a % b));
            System.out.println("increment: " + (a + 1));
            System.out.println("decrement: " + (b - 1));
        }



        static void assignment(int x){
            int value = x;
            System.out.println("x += x -> " + (value += x));
            value = x;
            System.out.println("x -= x -> " + (value -= x));
            value = x;
            System.out.println("x *= x -> " + (value *= x));
            value = x;
            System.out.println("x /= x -> " + (value /= x));
            value = x;
            System.out.println("x %= x -> " + (value %= x));
            value = x;
            System.out.println("x &= x -> " + (value &= x));
            value = x;
            System.out.println("x |= x -> " + (value |= x));
            value = x;
            System.out.println("x ^= x -> " + (value ^= x));
            value = x;
            System.out.println("x >>= x -> " + (value >>= x));
            value = x;
            System.out.println("x <<= x -> " + (value <<= x));
        }


        static void comparison(int a, int b){
            System.out.println("a == b -> " + (a == b));
            System.out.println("a != b -> " + (a != b));
            System.out.println("a > b  -> " + (a > b));
            System.out.println("a < b  -> " + (a < b));
            System.out.println("a >= b -> " + (a >= b));
            System.out.println("a <= b -> " + (a <= b));
        }

        static void logical(boolean p, boolean q){
            System.out.println("p && q -> " + (p && q));
            System.out.println("p || q -> " + (p || q));
            System.out.println("p ^ q  -> " + (p ^ q));
            System.out.println("!p     -> " + (!p));
            System.out.println("!q     -> " + (!q));
        }

        public static void main(String[] args){

            arithmetic(10,20);
            assignment(10);
            comparison(10,20);
            logical(true, false);
            
        }






        

        

    }
    


