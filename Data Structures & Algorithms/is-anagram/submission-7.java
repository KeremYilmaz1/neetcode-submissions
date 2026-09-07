class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charArray = s.toCharArray();
        char[] char2Array = t.toCharArray();

        Arrays.sort(charArray);
        Arrays.sort(char2Array);

        return Arrays.equals(charArray, char2Array);
    }
}
