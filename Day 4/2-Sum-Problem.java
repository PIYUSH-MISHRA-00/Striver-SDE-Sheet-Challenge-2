// O(NLog(N)) Two Pointer
class Solution {
    public int[] twoSum(int[] arr, int target) {
        if(arr == null)
	    		return null;
	    	int[] nums = Arrays.copyOf(arr, arr.length);
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        while(left<right) {
            int two_sum=nums[left]+nums[right];
            if(two_sum == target)
                break;
            else if(two_sum > target)
                right--;
            else
                left++;
        }
        int x=0;
        int y=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == nums[left])
                x=i;
            else if(arr[i]==nums[right])
                y=i;
        }
        return new int[] {x,y};
    }      
}

// o(N) Hashmap
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement))
                return new int[] {map.get(complement), i};
            map.put(nums[i],i);
        }
        return new int[] {0,0};
    }
            
}