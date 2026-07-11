class Solution {
    public boolean isPalindrome(String s) {
        String m2 = s.toLowerCase();
        char c[]=m2.toCharArray();

   int l =0;
   int r= s.length()-1;
   
   while(r>l){
   while(!Character.isLetterOrDigit(c[l]) && r>l){
   
        ++l;
   }
    while(!Character.isLetterOrDigit(c[r])&& r>l){
        --r;
    
   }
   
   if(c[l]!=c[r])
  return false;
 ++l;
 --r;
   }
   return true;
    
    

        
       
        
    }
}
