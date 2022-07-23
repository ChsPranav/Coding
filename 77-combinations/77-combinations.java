class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>ans=new ArrayList<>();
    int[] a=new int[n];
        for(int i=0;i<n;i++)a[i]=i+1;
        getcomb(a,k,0,0,ans,new ArrayList<>());
        return ans;
    }
    public void getcomb(int[] a,int k,int index,int value,List<List<Integer>>ans,ArrayList<Integer>ds){
        if(index==k){
            ans.add(new ArrayList<>(ds));
        }
        for(int i=value;i<a.length;i++){
            ds.add(a[i]);
            getcomb(a,k,index+1,i+1,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
}