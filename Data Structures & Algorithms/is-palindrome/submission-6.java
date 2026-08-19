class Solution {
    public boolean isPalindrome(String s) {
        int len = s.length();
        int left = 0;
        int right;
        if (len!=0){
            right=len-1;
        }else{
            right = 0;
        }
        while (left<=right){
            char l= Character.toLowerCase(s.charAt(left));
            char r = Character.toLowerCase(s.charAt(right));

            while (!Character.isLetterOrDigit(l)){
                left++;
                l=Character.toLowerCase(s.charAt(left));
            }
            while (!Character.isLetterOrDigit(r)){
                right--;
                r=Character.toLowerCase(s.charAt(right));
            }

            if (l!=r){
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
