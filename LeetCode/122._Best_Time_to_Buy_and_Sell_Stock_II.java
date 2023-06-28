class Solution {
    public int maxProfit(int[] prices) {
        // int n=prices.length,large=0;
        // for(int i=0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         if((prices[j]-prices[i])>large){
        //             large=prices[j]-prices[i];
        //             System.out.print(large);
        //         }
        //     }
        // }

        // return large;

        int profit=0;
        for(int i=1; i<prices.length; i++){
            if(prices[i]>prices[i-1]){
                profit += (prices[i]-prices[i-1]);
            }
        }
        return profit;
    }
}