class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)return 0;
        return binarysearch(nums,0,nums.length-1);
    }
    public int binarysearch(int[] nums,int left,int right){
        if(left<right  && left+1!=right ){
            int mid=left+(right-left)/2;
            if(nums[mid-1]<nums[mid] && nums[mid+1]<nums[mid])return mid;
             int check=binarysearch(nums,mid,right);
            //System.out.println(check+"first");
             if(check!=-1)return check;
             //System.out.println(nums[left]+"second"+nums[mid]);
              check=binarysearch(nums,left,mid);
           // System.out.println("second"+check);
             
              if(check!=-1)return check;
            }
         if(nums[nums.length-1]>nums[nums.length-2])return nums.length-1;
         if(nums[0]>nums[1])return 0;
         return -1;
    }
}