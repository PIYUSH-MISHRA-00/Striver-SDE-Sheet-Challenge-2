class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix[0].length;
        for(int i=0; i<matrix.length; i++) 
            if(matrix[i][0] <= target && matrix[i][n-1] >= target)
                return binarysrch(matrix[i], target);
        return false;
    } 
    boolean binarysrch(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while(start <= end) {
            int mid = start + (end-start) / 2;
            if(target < arr[mid])
                end=mid-1;
            else if(target > arr[mid])
                start=mid+1;
            else
                return true;
        }
        return false;
    }
}
