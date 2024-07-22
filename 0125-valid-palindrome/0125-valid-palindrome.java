class Solution {
    public boolean isPalindrome(String s) {
        // Normalize the string: convert to lowercase and remove non-alphanumeric characters
        StringBuilder normalized = new StringBuilder();
        
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                normalized.append(Character.toLowerCase(c));
            }
        }
        
        // Check if the normalized string is a palindrome
        String normalizedStr = normalized.toString();
        int left = 0;
        int right = normalizedStr.length() - 1;
        
        while (left < right) {
            if (normalizedStr.charAt(left) != normalizedStr.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
