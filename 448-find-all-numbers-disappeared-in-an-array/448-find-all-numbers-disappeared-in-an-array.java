class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int size=nums.length;
        ArrayList<Integer>values=new ArrayList<Integer>();
        HashSet<Integer>ans=new HashSet<Integer>();
        for(int i=0;i<size;i++)ans.add(nums[i]);
        for(int i=1;i<=size;i++){
            if (!ans.contains(i))values.add(i);
        }
        return values;
    }
}