class Solution {
    public int maxProfit(int[] prices) {
        int buy=prices[0];
        int profit=0;

        for(int i=1;i<=prices.length-1;i++){
            if(prices[i]<buy){
                buy=prices[i];
            }
            int CP=prices[i]-buy;
            profit=Math.max(CP,profit);
        }
        return profit;
    }
}
