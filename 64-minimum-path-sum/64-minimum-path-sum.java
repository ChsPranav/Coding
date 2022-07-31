class Solution {
    public int minPathSum(int[][] grid) {
        int dp[][]=new int[grid.length][grid[0].length];
        dp[0][0]=grid[0][0];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==0 && j==0)continue;
                int up=Integer.MAX_VALUE,left=Integer.MAX_VALUE;
                if(i>0)up=dp[i-1][j];
                if(j>0)left=dp[i][j-1];
                int min=Math.min(up,left);
                dp[i][j]=min+grid[i][j];
                //System.out.println(dp[i][j]);
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }
    // public int rec(int[][]grid,int i,int j){
    //     if(i==0 && j==0)return grid[0][0];
    //     if(i<0 || j<0)return -1;
    //     int up=rec(grid,i-1,j);
    //     int right=rec(grid,i,j-1);
    //     int max=0;
    //     if(up!=-1 && right!=-1){
    //          max=Math.min(up+grid[i][j],right+grid[i][j]);
    //     }
    //     else if(up==-1){
    //         max=right+grid[i][j];
    //     }
    //     else {
    //         max=up+grid[i][j];
    //     }
    //     //System.out.println(max+"dsd"+i+"ds"+j);
    //     return max;
    // }
}