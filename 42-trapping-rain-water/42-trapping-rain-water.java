class Solution {
    public int trap(int[] height) {
        int ans=0;
        int left=0;
        int right=height.length-1;
        int left_max=0,right_max=0;
        while(left<right){
            if(height[left]<height[right]){
                if(height[left]<left_max){
                    ans+=left_max-height[left];
                }
                left_max=Math.max(left_max,height[left]);
                
                left++;
            }
            else{
                if(height[right]<right_max){
                    ans+=right_max-height[right];
                }
                right_max=Math.max(right_max,height[right]);
                right--;
            }
        }
        return ans;
    }
}