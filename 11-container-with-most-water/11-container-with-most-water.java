class Solution {
    public int maxArea(int[] height) {
        int volume=Integer.MIN_VALUE;
        int i=0;
        int j=height.length-1;
        while(i<j){
            if(height[i]<height[j]){
               volume=Math.max((height[i]*(j-i)),volume);
                i++;
            }
            else{
                volume=Math.max((height[j]*(j-i)),volume);
                j--;
            }

        }
        return volume;
    }
}