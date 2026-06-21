import java.util.Arrays;


public class anagram {
    public static void main(String [] args){
        String str1="silent";
        String str2="listen";

        //convert to lower case
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();

        //convert to character array
        char[]arr1=str1.toCharArray();
        char[]arr2=str2.toCharArray();

        //sort the array
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("the word is anagram");

        }
        else{
            System.out.println("the word is not anagram");  
        }



    }
    
}
