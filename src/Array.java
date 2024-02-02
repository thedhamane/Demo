public class Array {
    public static void main(String[] args){
        int i=0;
        int sum=0;
        int [] nums= {1,4,2,5,3,10,7};

        for(i=1; i< nums.length;i++){
            if(nums[i] % 2 == 0){
                sum+= nums[i];
            }

        }
        System.out.println(sum);

    }
}
