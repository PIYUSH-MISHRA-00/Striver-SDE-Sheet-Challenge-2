class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        if (nums1.length == 0) nums1 = nums2;
        if (nums2.length == 0) return;
        int index = 0;
        for (int i = m; i < nums1.length; i++)
            nums1[i] = nums2[index++];

        Arrays.sort(nums1);
        
    }
}