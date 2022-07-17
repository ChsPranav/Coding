class Solution {
    public int search(int[] nums, int target) {
        int output=-1;
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[high])low=mid+1;
            else {
                high=mid;
            }
            
        }
        int start=low;
           low=0;
         high=nums.length-1;
        if(nums[start]<=target &&  nums[high]>=target)low=start;
        else{
            high=start;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            
            if(nums[mid]==target)return mid;
            else if(nums[mid]>target)high=mid-1;
            else{
                low=mid+1;
            }
        }
        return output;
    }
}