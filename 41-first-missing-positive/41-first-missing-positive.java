class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer>values=new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)values.add(nums[i]);
        int i=1;
        while(true){
            if(!values.contains(i))return i;
            else i++;
        }
    }
}