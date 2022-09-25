class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int ans=0;
        for(int i=0;i<k;i++)ans+=cardPoints[i];
        int temp=ans;
        for(int i=cardPoints.length-1,j=k-1;j>=0;i--,j--){
            temp+=cardPoints[i]-cardPoints[j];
            ans=Math.max(temp,ans);
        }
    return ans;
    }
}