class Solution {
    public void sortColors(int[] nums) {
        int[] arr = new int[3];
        for ( int i = 0 ; i < nums.length ; i++ ) 
            arr[nums[i]]++;
        int i = 0;
        for ( int j = 0 ; j < arr[0] ; j++ ) 
            nums[i++] = 0;
        for ( int j = 0 ; j < arr[1] ; j++ ) 
            nums[i++] = 1;
        for ( int j = 0 ; j < arr[2] ; j++ ) 
            nums[i++] = 2;
    }
}