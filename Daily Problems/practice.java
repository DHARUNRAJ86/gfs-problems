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

//score of a string
class Solution3 {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=1;i<s.length();i++){
           int c=(int)s.charAt(i);
           int c1=(int)s.charAt(i-1);
           sum+=Math.abs(c-c1);
        }
        return sum;
    }
}
//concatination of array
class Solution4 {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans = new int[2*n];
        for(int i=0;i<n;i++){
           ans[i]=nums[i];
           ans[i+n]=nums[i];
        }
        return ans;
    }
}
//contains duplicate
class Solution5 {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet()){
            int freq=map.get(key);
            if(freq>1){
                return true;
            }
        }
        return false;
    }
}
//valid Anagram
class Solution6 {
    public boolean isAnagram(String s, String t) {
      int[] freq = new int[26];
      for(char c:s.toCharArray()){
        freq[c-'a']++;
      }
      for(char c:t.toCharArray()){
        freq[c-'a']--;
      }
      for(int i=0;i<26;i++){
        if(freq[i]!=0){
            return false;
        }
      }
      return true;
    }
}
//Replace Elements With Greatest Element On Right Side
class Solution7 {
    public int[] replaceElements(int[] arr) {
       int n=arr.length;
       int[] ans = new int[n];
       for(int i=0;i<n;i++){
          int rightMax=-1;
          for(int j=i+1;j<n;j++){
            rightMax=Math.max(rightMax,arr[j]);
          }
          ans[i]=rightMax;
       } 
       return ans;
    }
}
//Is Subsequence
class Solution8 {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==s.length();
    }
}

