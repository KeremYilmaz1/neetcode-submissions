public class Solution {
    public bool IsAnagram(string s, string t) {
        char [] tSort = t.ToCharArray();
        char [] sSort = s.ToCharArray();
        Array.Sort(sSort);
        Array.Sort(tSort);
        return sSort.SequenceEqual(tSort);
    }
}
