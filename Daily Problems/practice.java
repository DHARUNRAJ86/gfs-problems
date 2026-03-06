//Missing Number
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
//Second Larges Element
class Solution {
    public int getSecondLargest(int[] arr) {
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for(int n:arr){
            if(n>max1){
                max2=max1;
                max1=n;
            }
            else if(n>max2 && n!=max1){
                max2=n;
            }
        }
        return (max2==Integer.MIN_VALUE)?-1:max2;
    }
}