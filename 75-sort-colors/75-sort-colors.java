class Solution {
    public void sortColors(int[] nums) {
        int zeros=0,ones=0,twos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)zeros++;
            else if(nums[i]==2)twos++;
            else ones++;
        }
        int i=0;
        while(zeros!=0){
            nums[i]=0;
            i++;
            zeros--;
        }
        while(ones!=0){
            nums[i]=1;
            i++;
            ones--;
        }
        while(twos!=0){
            nums[i]=2;
            i++;
            twos--;
        }
        
    }
}