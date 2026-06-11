public class Medianoftwosortedarrays {
    public static void main(String[] args) {
        int[] num1={1,2,3};
        int[] num2={4,5,6};
        int[] merged=new int[num1.length+num2.length];
        int i=0, j=0, k=0;
        // System.out.println(merged.length);


        while(i<num1.length && j<num2.length){
            if(num1[i]<num2[j]){
                merged[k++]=num1[i++];

            }
            else{
                merged[k++]=num2[j++];
            }

        }


        while(i<num1.length){
            merged[k++]=num1[i++];

        }

        while(j<num2.length){
            merged[k++]=num2[j++];
        }



        int total=merged.length;
        if(total%2==1){
            System.out.println( merged[total/2]);

        }
        else{
            System.out.println((merged[total/2]+merged[total/2-1])/2.0);
            
        }

        
    }
}
