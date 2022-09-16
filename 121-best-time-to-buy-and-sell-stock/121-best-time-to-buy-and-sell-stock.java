class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int purchased=prices[0];
        for(int i=0;i<prices.length;i++){
            if(purchased>prices[i]){
                purchased=prices[i];
            }
            if(purchased<prices[i]){
                if(profit<prices[i]-purchased){
                  profit=prices[i]-purchased;
                }
                
            }
        }
        return profit;
    }
}