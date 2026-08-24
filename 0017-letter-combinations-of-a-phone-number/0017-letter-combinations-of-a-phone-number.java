class Solution {
    String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> ans = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return ans;
        solve(digits, 0, "");
        return ans;
    }

    void solve(String s, int i, String cur) {
        if (i == s.length()) {
            ans.add(cur);
            return;
        }

        for (char c : map[s.charAt(i) - '0'].toCharArray())
            solve(s, i + 1, cur + c);
    }
}