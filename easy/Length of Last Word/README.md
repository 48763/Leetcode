# Length of Last Word	

Given a string s consists of upper/lower-case alphabets and empty space characters `' '`, return the length of last word in the string.

If the last word does not exist, return 0.

Note: A word is defined as a character sequence consists of non-space characters only.

**Example:**
```
Input: "Hello World"
Output: 5
```

# Solution

```java
class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 0)
            return 0;
         
        int len = s.length() - 1;
        while(len > 0 && s.charAt(len) == ' ')
            len--;

        for(int i = len ; i >=0; i--) {
            if(s.charAt(i) == ' ')
                return len - i;
        }
        
        return len + 1;
    }
}
```
