# Palindrome Number

Determine whether an integer is a palindrome. Do this without extra space.

**Some hints:**
Could negative integers be palindromes? (ie, -1)

If you are thinking of converting the integer to string, note the restriction of using extra space.

You could also try reversing an integer. However, if you have solved the problem "Reverse Integer", you know that the reversed integer might overflow. How would you handle such case?

There is a more generic way of solving this problem.

## Solution
```java
class Solution {
    public boolean isPalindrome(int x) {
        
        int reverse = 0;
        int temp = x;
        
        while (temp > 0) {
            reverse = reverse*10 + temp%10;
            temp /= 10;
        }
        
        if (reverse == x)
            return true;
        return false;    
    }
}
```
