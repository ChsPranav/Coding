class Solution {
    public int maxSubArray(int[] nums) {
        int best=nums[0],temp=0;
        for(int i=0;i<nums.length;i++){
            temp+=nums[i];
            if(temp>best)best=temp;
            if(temp<0)temp=0;
        }
        return best;
    }
}