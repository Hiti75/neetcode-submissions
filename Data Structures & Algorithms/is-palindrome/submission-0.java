class Solution {
    public boolean isPalindrome(String s) {
     StringBuilder sb = new StringBuilder(s);
     String m = sb.reverse().toString();
     String a = m.replaceAll("[^a-zA-Z0-9]","");
      String b = s.replaceAll("[^a-zA-Z0-9]","");
     if(a.equalsIgnoreCase(b)){
        return true;
     }
     else{
        return false;
     }
    

        
       
        
    }
}
