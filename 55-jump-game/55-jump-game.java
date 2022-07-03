class Solution {
    public boolean canJump(int[] nums) {
        boolean ans=false;
        int pos=0;
        if(nums.length==1)return true;
            if(nums[pos]==0)return ans;
            else {
                ans=jump(nums,pos);
                if(ans==true)return ans;
            }
        return ans;
    }
    public static boolean jump(int[] nums,int pos){
        if(pos>=nums.length-1)return true;
        else {
            if(nums[pos]+pos>=nums.length-1)return true;
            else{
                while(nums[pos]!=0){
                    boolean result=jump(nums,pos+nums[pos]);
                    if(result==true)return true;
                    nums[pos]--;
                }
                return false;
                
            }
        }
 
    }
    
    
}