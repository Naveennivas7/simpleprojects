public class stringexample {
    public static void main (String[]args){
        String s1="naveen is my name";
        String s2="mathi is my sister";
        String s3="mathi is my sister                               ";

        String s4=s1+s2;
        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.indexOf("is"));
        System.out.println(s1.charAt(0));

        System.out.println(s2.equals(s3));
        System.out.println(s3.trim());
        System.out.println(s4);
        System.out.println(s1.concat(s2).concat(s3));






    }
    
}
