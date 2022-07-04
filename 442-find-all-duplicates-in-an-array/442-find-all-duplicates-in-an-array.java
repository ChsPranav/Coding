class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer>ans=new HashSet<Integer>();
        ArrayList<Integer>values=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            if(ans.contains(nums[i]))values.add(nums[i]);
            else ans.add(nums[i]);
        }
    return values;
    }
}