# Longest Common Prefix

Write a function to find the longest common prefix string amongst an array of strings.

## Solution
```java
class Solution {
    public String longestCommonPrefix(String[] strs) {

        int min;
        char[] ch_str;
        String result = "";
        
        if(strs.length == 0)
            return "";
        
        ch_str = strs[0].toCharArray();
        min = strs[0].length();
        
        for (int i = 1; i < strs.length; i++ ) {
            
            if(strs[i].length() == 0) 
                return "";
            
            if(strs[i].length() < min) 
                min = strs[i].length();
        }
        
        for (int i = 0; i < min; i++) {
            for (int j = 1; j < strs.length; j++) {
                if(ch_str[i] != strs[j].toCharArray()[i]) {
                    return result;
                }
            }
            result += String.valueOf(ch_str[i]);
        }
        
        return result;
    }
}
```
