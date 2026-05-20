class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int b=0, s=1; 
        while(s < prices.length) {
            if(prices[b]< prices[s]){
                profit = Math.max(profit, prices[s]- prices[b]);
            
            }
            else {
               b=s;
                
            }
            s++;
        }
        return profit; 
    }
}
