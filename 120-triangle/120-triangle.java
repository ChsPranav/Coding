class Solution {
    int dp[][];
    public int minimumTotal(List<List<Integer>> triangle) {
        dp=new int[triangle.size()][triangle.get(triangle.size()-1).size()];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return rec(triangle,0,0);
    }
    public int rec(List<List<Integer>> triangle,int index,int pos){
        if(index==triangle.size())return 0;
        List<Integer>data=new ArrayList<>(triangle.get(index));
        if(dp[index][pos]!=-1)return dp[index][pos];
        int min;
        if(index+1!=triangle.size()){
            if(pos+1!=data.size()){
                min=Math.min(rec(triangle,index+1,pos)+data.get(pos),rec(triangle,index+1,pos+1)+data.get(pos+1));
            }
            else{
                min=rec(triangle,index+1,pos)+data.get(pos);
            }
        }
        
        else{
            if(pos+1!=data.size())min=Math.min(data.get(pos),data.get(pos+1));
            else return dp[index][pos]=data.get(pos);
        }
        //System.out.println(min+"dsd"+index+"dsds"+pos);
        return dp[index][pos]=min;
    }
}