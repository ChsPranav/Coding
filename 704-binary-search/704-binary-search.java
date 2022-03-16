class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int end=nums.length-1;
        int mid=(end-low)/2;
        System.out.println(mid);
        while(low<=end){
            mid=low+(end-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                end=mid-1;
            }else
            {
                low=mid+1;
            }
            
        }
        return -1;
    }
}