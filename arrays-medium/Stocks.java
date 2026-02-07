public class Stocks {
    static int stocks(int prices[]){
        int max_Profit = 0;
        int buy = prices[0];
        
        

        for(int i = 0; i<prices.length; i++){
            if(buy>prices[i]){
                buy = prices[i];
            }
            
            int profit = prices[i]- buy;
            max_Profit = Math.max(max_Profit, profit);
            
        }
        return max_Profit;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        int maxProfit = stocks(prices);
        System.out.println("-> "+ maxProfit);
        
    }
}
