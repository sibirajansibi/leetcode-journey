class Solution {
    public int strStr(String haystack, String needle) {

        for(int i=0;i<haystack.length();i++)
        {
            if(haystack.charAt(i)==needle.charAt(0))
            {
                int j=0;
                int k=i;

                while(j<needle.length() && k<haystack.length() && needle.charAt(j)==haystack.charAt(k))
                {
                    j++;
                    k++;
                    if(j==needle.length())
                    {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}