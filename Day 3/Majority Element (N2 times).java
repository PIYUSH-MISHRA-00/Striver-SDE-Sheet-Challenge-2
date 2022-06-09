// O(N*Log(N))
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int c=1;
        for(int i=1;i<nums.length; i++) {
            if(nums[i-1] != nums[i]) {
                if(c*2 > nums.length)
                    return nums[i-1];
                c=1;
            }
            else c++;
        }
        if(c*2 > nums.length)
            return nums[nums.length-1];
        return -1;
    }
}
// O(N)
class Solution {
    public int majorityElement(int[] nums) {
        
        int voteCount = 0;
        int candidate = -1;
        for(int i=0; i<nums.length; i++){
            if(voteCount == 0){
                candidate = nums[i];
                voteCount = 1;
            }else if(candidate == nums[i]){
                voteCount++;
            }else{
                voteCount--;
            }
        }
        
        return candidate;
    }
}