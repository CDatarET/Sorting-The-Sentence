class Solution {
    public String sortSentence(String s) {
        String[] strs = s.split(" ");
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        for(int i = 0; i < strs.length; i++){
            map.put((int)(strs[i].charAt(strs[i].length() - 1) - '0'), strs[i]);
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= map.size(); i++){
            sb.append(map.get(i).substring(0, map.get(i).length() - 1));
            if(i != map.size()){
                sb.append(" ");
            }
        }

        return(sb.toString());
    }
}
