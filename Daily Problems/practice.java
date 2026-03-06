class Solution {
    int missingNum(int arr[]) {
        int n=arr.length+1;
        long expectedSum=(long)n*(n+1)/2;
        long actualSum=0;
        for(int n1:arr){
            actualSum+=n1;
        }
        return (int)(expectedSum-actualSum);
        
    }
}