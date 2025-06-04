class Solution {
    public String answerString(String word,int numFriends) {
        if(numFriends==1){
            return word;
        }
        String maxSuffix=lastSubstring(word); 
        int totalLen=word.length();
        int suffixLen=maxSuffix.length();

        return maxSuffix.substring(0,Math.min(suffixLen,totalLen-numFriends+1));
    }
    public String lastSubstring(String s) {
        int start=0,candidate=1,length=s.length();
        while(candidate<length) {
            int offset=0;
            while(candidate+offset<length && s.charAt(start+offset)==s.charAt(candidate+offset)) {
                offset++;
            }
            if(candidate+offset<length && s.charAt(start+offset)<s.charAt(candidate+offset)) {
                int prevStart=start;
                start=candidate;
                candidate=Math.max(candidate+1,prevStart+offset+1);
            } else {
                candidate+=offset+1;
            }
        }

        return s.substring(start);
    }
}