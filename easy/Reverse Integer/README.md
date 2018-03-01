# Reverse Integer

Given a 32-bit signed integer, reverse digits of an integer.

Example 1:
```
Input: 123
Output:  321
```

Example 2:
```
Input: -123
Output: -321
```

Example 3:
```
Input: 120
Output: 21
```

**Note:**
Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

## Solution

```java
class Solution {
    public int reverse(int x) {
        String int_temp = new String("" + Math.abs(x));
        String int_revers = "";
        long ln_int_revers;
          
        if (Math.abs(x) < 0) {
            return 0;
        }
        
        if (x < 0) {
            int_revers = "-";
        }
        
        for(int i = int_temp.length() - 1   ; i >= 0; i --) { 
            int_revers += int_temp.charAt(i);
        }   
        
        if ( Math.abs(Long.valueOf(int_revers)) > Integer.MAX_VALUE) {
            return 0;
        }
        
        return Integer.parseInt(int_revers);
    }
}
```
