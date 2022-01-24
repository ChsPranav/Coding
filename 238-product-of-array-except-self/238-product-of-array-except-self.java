class Solution {
    public int[] productExceptSelf(int[] nums) {
      int[] arr=new int[nums.length];
      int product=1;
        for(int i=0;i<nums.length;i++){
            product=product*nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                arr[i]=product/nums[i];
            }
            else{
                int j=0;
                arr[i]=1;
                while(j<nums.length){
                    if(i!=j){
                       arr[i]=arr[i]*nums[j]; 
                    }
                    j++;
                }
            }
        }
        return arr;
    }
}