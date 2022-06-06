// KADANE's Algorith
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for ( int i = 0 ; i < nums.length ; i++ ) {
            if ( sum < 0 )
                sum = nums[i];
            else
                sum += nums[i];
            max = (int)Math.max(max,sum);
        }
        return max;
    }
}



// RECURSION
class Solution {
    int ans = Integer.MIN_VALUE;
    public int maxSubArray(int[] nums) {
        helper(nums, 0);
        return ans;
    }
    int helper( int[] arr, int index) {
        int max = 0;
        if( index == arr.length ) {
            return 0;
        }
        max = Math.max(arr[index], helper(arr, index+1)+arr[index]);
        ans = Math.max(max, ans);
        return max;
    }
}