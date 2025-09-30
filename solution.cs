public class Solution {
    public string SortSentence(string s) {
        string[] strs = s.Split(' ');
        Dictionary<int, string> d = new Dictionary<int, string>();

        for(int i = 0; i < strs.Length; i++){
            d[strs[i][strs[i].Length - 1] - '0'] = strs[i];
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= d.Count; i++){
            sb.Append(d[i].Substring(0, d[i].Length - 1));
            if (i != d.Count) {
                sb.Append(" ");
            }
        }

        return sb.ToString();
    }
}
