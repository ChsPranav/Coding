class Solution {
    public int longestPalindromeSubseq(String s) {
        int dp[][]=new int[s.length()+1][s.length()+1];
        for(int i=s.length();i>=0;i--){
            for(int j=0;j<=s.length();j++){
                if(i==s.length() || j==0){
                    dp[i][j]=0;
                    continue;
                }
                if(s.charAt(i)==s.charAt(j-1)){
                    dp[i][j]=1+dp[i+1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j-1]);
                }
            }
        }
        return dp[0][s.length()];
    }
    public int rec(String s,int index1,int index2){
        if(index1>=s.length() || index2<0)return 0;
        if(s.charAt(index1)==s.charAt(index2)){
            return 1+rec(s,index1+1,index2-1);
        }
            return Math.max(rec(s,index1+1,index2),rec(s,index1,index2-1));
    }
}