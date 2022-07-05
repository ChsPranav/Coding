class Solution {
    public int firstMissingPositive(int[] nums) {
       int i=0;
        while(i<nums.length){
            if(nums[i]<=0 || nums[i]>=nums.length){
                i++;
            }else{
                if(nums[i]-1==i)i++;
                else if(nums[i]!=nums[nums[i]-1]){
                    swap(nums,i,nums[i]-1);
                }else{
                    i++;
                } 
            }
        }
        i=1;
        while(i<=nums.length){
            if(i!=nums[i-1])return i;
            else i++;
        }
        //if(nums.length==1)return 2;
        return nums.length+1;
        
    }
    public static void swap(int[] nums,int x,int y){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
}   