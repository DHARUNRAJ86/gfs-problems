class countPartition{
    public static void main(String[] args){
        int[] nums={5,2,6,4};
        int d=3;
        System.out.println(countPartitions(nums, d));
    }
    public static int countPartitions(int[] nums,int d){
        int n=nums.length;
        int totalSum=0;
        for(int num:nums) totalSum+=num;
        if(totalSum-d <0 || (totalSum-d)%2==1) return 0;
        int target=(totalSum-d)/2;
        int[] dp = new int[target+1];
        dp[0]=1;
        if(nums[0]<=target) dp[nums[0]]=1;
        for(int ind=1;ind<n;ind++){
            int[] curr = new int[target+1];
            curr[0]=1;
            for(int sum=0;sum<=target;sum++){
                int notTake = dp[sum];
                int take=0;
                if(nums[ind]<=sum) take=dp[sum-nums[ind]];
                curr[sum]=notTake+take;
            }
            dp = curr;
        }
         return dp[target];
    }
}