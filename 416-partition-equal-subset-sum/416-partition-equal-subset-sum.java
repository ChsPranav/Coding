class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num: nums){
            sum+=num;
        }
        if(sum%2==1)return false;
        sum=sum/2;
        boolean [][] dp = new boolean[nums.length+1][sum+1];
        dp[0][0]=true;
        for(int i=1; i<=nums.length;++i){
            for(int j=0; j<=sum;++j){
                if(j-nums[i-1]>=0){
                    dp[i][j]=dp[i-1][j-nums[i-1]];
                }
                dp[i][j]=dp[i][j]||dp[i-1][j];
            }
        }
        return dp[nums.length][sum];
    }
}