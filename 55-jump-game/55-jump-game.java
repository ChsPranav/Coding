class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1 && nums[0]==0)return true;
        int reachable=0;
        for(int i=0;i<nums.length;i++){
            if(i>reachable)return false;
            if(nums[i]+i>=reachable)reachable=nums[i]+i;
        }
        //System.out.println("check"+reachable);
        if(reachable>=nums.length-1)return true;
        return false;
    }
}