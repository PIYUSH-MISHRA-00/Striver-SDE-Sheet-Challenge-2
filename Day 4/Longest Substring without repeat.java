class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> map=new HashSet<>();
        int max=0;
        int l=0;
        for(int i=0; i<s.length(); i++) {
            char ch=s.charAt(i);
            while(l<i && map.contains(ch)) {
                map.remove(s.charAt(l));
                l++;
            }
            max=Math.max(max, i-l+1); 
            map.add(ch);
        }
        return max;
    }
}