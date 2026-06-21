public class foreachexample {
    public static void main(String[]args){
        String[] cars={"bmw","volvo","ford","hindusthan motors"};
        int[] num={1,2,3,4,5};
        for(int nums:num){
            System.out.println(nums);
        }

        for(String car:cars){
            System.out.println(car);
        }
    }
    
}
