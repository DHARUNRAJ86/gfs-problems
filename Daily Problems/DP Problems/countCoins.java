class countCoins{
    public static void main(String[] args){
        int[] coins ={1,2,3};
        int amount=4;
        change(amount,coins);
    }
    public static int change(int amount, int[] coins) {
        int n=coins.length;
        int[][] dp = new int[n][amount+1];
        for(int T=0;T<=amount;T++){
            dp[0][T]=(T%coins[0]==0)?1:0;
        }
        for(int ind=1;ind<n;ind++){
            for(int T=0;T<=amount;T++){
                int notTake = dp[ind-1][T];
                int take=0;
                if(coins[ind]<=T){
                    take = dp[ind][T-coins[ind]];
                }
                dp[ind][T]=take+notTake;
            }
        }
        return dp[n-1][amount];
    }
}