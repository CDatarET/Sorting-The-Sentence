class Solution:
    def sortSentence(self, s: str) -> str:
        strs = s.split(" ")
        d = {}

        for i in range(len(strs)):
            d[int(strs[i][len(strs[i]) - 1])] = strs[i][0:len(strs[i]) - 1]

        ret = ""
        for i in range(len(d)):
            ret = ret + d[i + 1]
            if(i + 1 != len(d)):
                ret = ret + " "
        
        return(ret)
