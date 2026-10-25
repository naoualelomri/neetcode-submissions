class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length()-1;
        StringBuilder str = new StringBuilder(s);
        while (l<r){
           while(l<r && !Character.isLetterOrDigit(str.charAt(l))){
            l++;
           }
           while(l<r && !Character.isLetterOrDigit(str.charAt(r))){
            r--;
           }
           if (Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
            return false;
           }
           l++;
           r--;

        }
        return true;    
    }
}
