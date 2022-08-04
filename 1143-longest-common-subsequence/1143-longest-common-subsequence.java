class Solution {
    int dp[][];
    public int longestCommonSubsequence(String text1, String text2) {
        dp=new int[text1.length()+1][text2.length()+1];
         for(int i=0;i<dp.length;i++){
             for(int j=0;j<dp[i].length;j++){
                 if(i==0 || j==0){dp[i][j]=0;continue;}
                 if(text1.charAt(i-1)==text2.charAt(j-1)){
                     dp[i][j]=1+dp[i-1][j-1];
                 }
                 else{
                     dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                 }
             }
         }
        return dp[text1.length()][text2.length()];
    }
    public int rec(String text1,String text2,int index1,int index2){
        if(index1<0 || index2<0)return 0;
        if(dp[index1][index2]!=-1)return dp[index1][index2];
        if(text1.charAt(index1)==text2.charAt(index2))return dp[index1][index2]=1+rec(text1,text2,index1-1,index2-1);
        
        return dp[index1][index2]=Math.max(rec(text1,text2,index1,index2-1),rec(text1,text2,index1-1,index2));
    }
}