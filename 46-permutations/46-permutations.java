class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        getpermutation(nums,0,ans,new ArrayList<>());
        return ans;
    }
    public void getpermutation(int[]nums,int index,List<List<Integer>>ans,ArrayList<Integer>ds){
        if(index==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!ds.contains(nums[i]))
            {
                ds.add(nums[i]);
            getpermutation(nums,index+1,ans,ds);
            ds.remove(ds.size()-1);
            }
        }
        
        
    }
}