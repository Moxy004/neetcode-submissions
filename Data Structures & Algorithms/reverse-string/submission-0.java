class Solution {
    public void reverseString(char[] s) {
        int last = s.length - 1;

        for(int slow = 0; slow < last; slow++){
            if(s[slow] != s[last]){
                char temp = s[slow];
                s[slow] = s[last];
                s[last] = temp;
            }
            last--;
        }
    }
}