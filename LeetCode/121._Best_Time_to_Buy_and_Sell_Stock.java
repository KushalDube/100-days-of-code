class Solution {
    public int maxProfit(int[] prices) {
        // Approach 1
        // int max=0,min=0;
        // for (int i=0; i<prices.length; i++){
        //     for (int j=i+1; j<prices.length; j++){
        //         if(j<i){
        //             min=prices[j];
        //         }
        //     }
        // }
        // for (int i=0; i<prices.length; i++){
        //     for (int j=i; j<prices.length; j++){
        //         if(j>i){
        //             max=prices[j];
        //         }
        //     }
        // }
        // System.out.print(max+" "+min);
        // return max-min;

        // Approach 2
        // int price=0,max=0;
        // for(int i=0; i<prices.length; i++){
        //     price=0;
        //     for(int j=i+1; j<prices.length; j++){
        //         price=prices[j]-prices[i];
        //         // System.out.print(price+" ");
        //         if(price>max){
        //             max=price;
        //         }
        //         // System.out.println(max+" ");
        //     }
        // }

        // return max;

    }
}