class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;

        for (int sum : prices){
            if(sum<min){
                min =sum;

            }
            int profit = sum - min;
            maxProfit = Math.max(profit,maxProfit);
        }
        return maxProfit;
    }
}