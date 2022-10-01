class Solution {
    public int[] twoSum(int[] nums, int target) {
        ArrayList<Integer>data=new ArrayList<>();
        for(int i=0;i<nums.length;i++)data.add(nums[i]);
        
        for(int i=0;i<nums.length;i++){
            if(data.contains(target-nums[i]) &&  i!=data.indexOf(target-nums[i])){
                int[] arr={i,data.indexOf(target-nums[i])};
                return arr;
            }
        }
        int[] arr=new int[0];
    return arr;
    }
    
}