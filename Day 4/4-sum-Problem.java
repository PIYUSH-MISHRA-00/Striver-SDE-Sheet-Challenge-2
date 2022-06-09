class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            int target_3=target-nums[i];
            for(int j=i+1; j<nums.length; j++) {
                int target_2=target_3-nums[j];
                int left=j+1;
                int right=nums.length-1;
                while(left<right) {
                    int two_sum=nums[left]+nums[right];
                if(two_sum == target_2) {
                    List<Integer> quad = new ArrayList<>();
                    quad.add(nums[i]);
                    quad.add(nums[j]);
                    quad.add(nums[left]);
                    quad.add(nums[right]);
                    ans.add(quad);
                    while (left < right && nums[left] == quad.get(2)) ++left;
                    while (left < right && nums[right] == quad.get(3)) --right;
                }
                else if(two_sum > target_2)
                    right--;
                else
                    left++;
                }
                while(j + 1 < nums.length && nums[j + 1] == nums[j]) ++j;
            }
            while (i + 1 < nums.length && nums[i + 1] == nums[i]) ++i;
        }
        return ans;
    }
}