class targetSum {
    public int findTargetSumWays(int[] nums, int target) {
        int totalSum=0;
        for(int num:nums){
            totalSum+=num;
        }
        if(totalSum-target<0 || (totalSum-target)%2!=0) return 0;
        return findWays(nums,(totalSum-target)/2);
    }
    public static int findWays(int[] nums,int target){
        int n=nums.length;
        int[] prev = new int[target+1];
        
        if(nums[0]==0) prev[0]=2;
        else prev[0]=1;
        //nums[0]=0
        if(nums[0]!=0 && nums[0]<=target) prev[nums[0]] =1;
        for(int ind=1;ind<n;ind++){
            int[] curr = new int[target+1];
            for(int sum=0;sum<=target;sum++){
                int notTake = prev[sum];
                int take=0;
                if(nums[ind]<=sum) take=prev[sum-nums[ind]];
                curr[sum] = take+notTake;
            }
            prev=curr;
        }
        return prev[target];
    }
}