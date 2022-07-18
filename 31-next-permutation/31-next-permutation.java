class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length==1)return;
        int greatestnumber=-1,index=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                greatestnumber=i;
                break;
            }
        }
        if(greatestnumber!=-1){
            //for(int j=0;j<nums.length;j++)System.out.println(nums[j]);
            for(int i=nums.length-1;i>=greatestnumber;i--){
            if(nums[i]>nums[greatestnumber]){
                int temp=nums[i];
                nums[i]=nums[greatestnumber];
                nums[greatestnumber]=temp;
                break;
            }
          }
            //System.out.problem(greatestnumber+"fdfd")
            for(int j=0;j<nums.length;j++)System.out.println(nums[j]);
        reverse(nums,greatestnumber+1);
        }
        else{
            reverse(nums,0);
        }
        
        
    }
    public void reverse(int[] nums,int k){
        int end=nums.length-1;
        int start=k;
        while(start<=end){
            int temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            start++;
            end--;
        }
    }
}