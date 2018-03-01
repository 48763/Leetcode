# Valid Parentheses	

Given a string containing just the characters `'(', ')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

The brackets must close in the correct order, `"()"` and `"()[]{}"` are all valid but `"(]"` and `"([)]"` are not.

## Solution

```java
class Solution {
    public boolean isValid(String s) {
        
        if(s.length()%2 != 0)
            return false;
        
        Character[] stack = new Character[s.length()];
        Integer count = 0;
        HashMap<Character, Character> symbol = new HashMap<Character, Character>();
        symbol.put('[', ']');
        symbol.put('{', '}');
        symbol.put('(', ')');
        
        
        for(int i = 0; i < s.length(); i++) {
            if(symbol.containsKey(s.toCharArray()[i])) {
                stack[count] = s.toCharArray()[i];
                count++;
                continue;
            }

            if(count == 0 || symbol.get(stack[count-1]) != s.toCharArray()[i]) 
                return false;  
            count--;
        }
        
        if(count == 0) 
            return true;
        else 
            return false;
    }
}
```
