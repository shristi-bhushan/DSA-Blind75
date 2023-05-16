
//Iterating through the prices array, keeping track of the minimum price seen so far and calculating the maxprofit that can be obtained if the stock is sold at the current price. By updating the minprice and maxprofit variables accordingly, it finds the maxprofit that can be achieved by buying and selling the stocks.

//Approach
//Greedy Approach- One pass

//Complexity
//Time complexity:
//O(n)

//Space complexity:
//O(1)

//Code
class Solution {
    public int maxProfit(int[] prices) {
        int minprice= Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0; i< prices.length; i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }
            else if(prices[i] - minprice > maxprofit){
                maxprofit= prices[i] - minprice;
            }
        }
        return maxprofit;
    }
}