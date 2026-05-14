class minimumCoin{
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        int[][] dp = new int[n][amount+1];
        //base case
        for(int i=0;i<=amount;i++){
            if(i%coins[0]==0) dp[0][i]=i/coins[0];
            else dp[0][i]=Integer.MAX_VALUE;
        }
        //parameters
        for(int ind=1;ind<n;ind++){
            for(int t=0;t<=amount;t++){
                //recursion
                int notTake = 0+dp[ind-1][t];
                int take=Integer.MAX_VALUE;
                if(coins[ind]<=t && dp[ind][t-coins[ind]]!=Integer.MAX_VALUE){
                    take=1+dp[ind][t-coins[ind]];
                }
                dp[ind][t]=Math.min(take,notTake);
            }
        }
        int ans=dp[n-1][amount];
        return (ans==Integer.MAX_VALUE)?-1:ans;
    }
}