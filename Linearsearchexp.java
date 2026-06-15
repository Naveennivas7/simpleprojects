public class Linearsearchexp {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 15, 20, 25 };
        int target = 20;
        System.out.println(LinearSearch1(arr, target));
    }

//it will return the index if the target value is found in the array otherwise it will return -1



    // static int LinearSearch(int[] arr,int target){


    //     if(arr.length==0){
    //         return -1;
    //     }

    //     for(int i=0;i<arr.length;i++){
    //         if(arr[i]==target){
    //             return i;
    //         }
    //     }
    //     return -1;
    // }



    //it will return the target value if it is found in the array otherwise it will return -1
           

    // static int LinearSearch1(int[] arr,int target){


    //     if(arr.length==0){
    //         return -1;
    //     }

    //     for(int element:arr ){
    //         if(element==target){
    //             return element;
    //         }
    //     }
    //     return -1;
    // }/




    //return true if the target value is found in the array otherwise it will return false
    


    static boolean LinearSearch1(int[] arr,int target){


        if(arr.length==0){
            return false;
        }

        for(int element:arr ){
            if(element==target){
                return true;
            }
        }
        return false;
    }

}

