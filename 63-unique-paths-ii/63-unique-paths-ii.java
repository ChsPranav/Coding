class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int dp[][]=new int[obstacleGrid.length][obstacleGrid[0].length];
        dp[0][0]=1;
        if(obstacleGrid[0][0]==1)return 0;
        for(int i=0;i<obstacleGrid.length;i++){
            for(int j=0;j<obstacleGrid[0].length;j++){
                if(i==0 && j==0)continue;
                int up=0,left=0;
                if(i>0 && obstacleGrid[i][j]!=1)up=dp[i-1][j];
                if(j>0 && obstacleGrid[i][j]!=1 )left=dp[i][j-1];
                dp[i][j]=up+left;
            }
        }
        return dp[obstacleGrid.length-1][obstacleGrid[0].length-1];
    }
    public int rec(int[][]obstacleGrid,int i,int j){
        if(i==0 && j==0)return 1;
        if(i<0 || j<0)return 0;
        if(obstacleGrid[i][j]==1)return 0;
        else{
           int up=rec(obstacleGrid,i-1,j);
           int left=rec(obstacleGrid,i,j-1);
           return up+left;
        }
    }
}