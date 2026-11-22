class Solution {
    public boolean isAnagram(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();
        if (l1 != l2) {
            return false;
        }
        int [] count = new int[26];
        for (int i = 0 ; i<s.length(); i++) {
            count[s.charAt(i) - 'a'] ++;
            count[t.charAt(i) - 'a'] --;
        }

        for (int value : count) {
            if (value !=0) {
                return false;
            }
        }
        return true;
    }
}
