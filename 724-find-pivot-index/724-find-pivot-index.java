class Solution {
    public int pivotIndex(int[] nums) {
      
        int left_sum=0,right_sum=0;
        int[] left_arr=new int[nums.length];
        int[] right_arr=new int [nums.length];
        for(int i=0,j=nums.length-1;i<nums.length && j>=0;i++,j--){
            // right_arr[i]=sum-nums[i];
            if(i==0)left_arr[i]=0;
            else{
                left_arr[i]=left_sum;
            }
            if(j==nums.length-1)right_arr[j]=0;
            else{
                right_arr[j]=right_sum;
            }
            left_sum+=nums[i];
            right_sum+=nums[j];
        }
        for(int i=0;i<nums.length;i++){
            if(left_arr[i]==right_arr[i])return  i;
        }
        return -1;
    }
}