class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int maxLength=0;
        HashSet<Character> h = new HashSet<>();
for(int r =0;r<s.length();r++){
char c = s.charAt(r);
    while(h.contains(c)){
        h.remove(s.charAt(l));
        l++;
    }
    h.add(c);
    maxLength = Math.max(maxLength,r-l+1);
}
return maxLength;
    }
}
