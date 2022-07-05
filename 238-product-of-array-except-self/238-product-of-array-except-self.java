class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pp=new int[nums.length];
        int[] a=new int[nums.length];
        pp[0]=1;
        for(int i=1;i<nums.length;i++){
            pp[i]=nums[i-1]*pp[i-1];
        }
        int sf=1;
        for(int i=nums.length-1;i>=0;i--){
            a[i]=sf*pp[i];
            sf=sf*nums[i];
        }
        return a;
    }
}