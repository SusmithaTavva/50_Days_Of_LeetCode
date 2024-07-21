class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        
        String previous = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();
        
        int count = 1;
        char currentChar = previous.charAt(0);
        
        for (int i = 1; i < previous.length(); i++) {
            if (previous.charAt(i) == currentChar) {
                count++;
            } else {
                result.append(count);
                result.append(currentChar);
                count = 1;
                currentChar = previous.charAt(i);
            }
        }
        
        result.append(count);
        result.append(currentChar);
        
        return result.toString();
    }
}
