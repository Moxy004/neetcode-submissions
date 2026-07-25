class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int last = s.length() - 1;

        for (int slow = 0; slow < last; slow++) {
            if (s.charAt(slow) != s.charAt(last)) {
                return false;
            }
            last--;
        }

        return true;
    }
}