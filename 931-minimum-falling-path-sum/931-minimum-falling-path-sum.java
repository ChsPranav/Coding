class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int dp[][]=new int[matrix.length][matrix.length];
        for(int j=0;j<matrix.length;j++)dp[0][j]=matrix[0][j];
        for(int i=1;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                int up=Integer.MAX_VALUE,left=Integer.MAX_VALUE,right=Integer.MAX_VALUE;
                up=matrix[i][j]+dp[i-1][j];
                if(j-1>=0)left=matrix[i][j]+dp[i-1][j-1];
                if(j+1<matrix.length)right=matrix[i][j]+dp[i-1][j+1];
                dp[i][j]=Math.min(up,Math.min(left,right));
            }
            
        }
        int min=dp[matrix.length-1][0];
        for(int i=1;i<matrix.length;i++){
            if(min>dp[matrix.length-1][i])min=dp[matrix.length-1][i];
        }
        return min;
    }
}