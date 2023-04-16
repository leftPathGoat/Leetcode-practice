class Solution {
    public boolean isPalindrome(int x) {
        String palindrome = String.valueOf(x);
        for(int i = 0; i < palindrome.length(); i++)
        {
            if(!(palindrome.charAt(i) == palindrome.charAt(palindrome.length() - i-1)))
                return false;
        }
        return true;
    }
}
