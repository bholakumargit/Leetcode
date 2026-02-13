class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
         int count = 0;
        int a = 0, b = 0;

        for (int i = 0; i < s1.length(); i++) {

            if (s1.charAt(i) != s2.charAt(i)) {

                if (count == 0) a = i;
                if (count == 1) b = i;

                count++;
            }
        }

       
        if (count == 0) return true;

     
        if (count == 2 &&
            s1.charAt(a) == s2.charAt(b) &&
            s1.charAt(b) == s2.charAt(a)) {

            return true;
        }

        return false;
        
    }
}