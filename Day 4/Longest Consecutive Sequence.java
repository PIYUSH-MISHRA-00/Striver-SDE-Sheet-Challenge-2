class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int x: nums)
            set.add(x);
        int max=0;
        for(int i=0; i<nums.length; i++) {
            int c=1;
            int num=nums[i];
            while(set.contains(--num)) {
                c++;
                set.remove(num);
            }
            num=nums[i];
            while(set.contains(++num)) {
                c++;
                set.remove(num);
            }
            max=Math.max(max, c);
        }
        return max;
    }
}