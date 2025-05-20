class Solution {
    public int lengthOfLongestSubstring(String s) {
        int j = 0;
        int max_length = 0;
        HashSet<Character> hs = new HashSet<>();
        for(int i = 0; i< s.length();i++){
            char current = s.charAt(i);
            while(hs.contains(current)){
                hs.remove(s.charAt(j));
                j++;
            }
            hs.add(current);
            max_length = Math.max(max_length, i-j+1);
        }
        return max_length;
    }
}