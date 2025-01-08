class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        if(words.length==1) return 0;
        for(int i=0;i<words.length;i++)
        {
            for(int j=i+1;j<words.length;j++)
            {
                if(isPrefixSuffix(words[i],words[j])) count++;
            }
        }

        return count;
    }
    static boolean isPrefixSuffix(String str1,String str2)
    {
        if (str1.length()>str2.length()) return false;
        return str2.startsWith(str1) && str2.endsWith(str1);
    }
}