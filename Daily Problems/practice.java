import java.util.*;
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
class Solution1 {
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
//sum of subarray
class Solution2 {
    public static int subArraySum(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int sum = 0;
        int count = 0;

        for(int num : arr){
            sum += num;

            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}
