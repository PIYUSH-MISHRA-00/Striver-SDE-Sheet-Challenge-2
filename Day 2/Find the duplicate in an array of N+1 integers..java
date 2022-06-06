class Solution {
    public int findDuplicate(int[] arr) {
        int[] ans = new int[arr.length+1];
        for ( int i = 0 ; i < arr.length ; i++ )
            if ( ++ans[arr[i]] == 2 )
                return arr[i];
        return -1;
    }
}