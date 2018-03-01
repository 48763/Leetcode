# Roman to Integer

Given a roman numeral, convert it to an integer.

Input is guaranteed to be within the range from 1 to 3999.

## Solution
```java
class Solution {
    public int romanToInt(String s) {
        int temp, current, accumulator = 0;
        Map<Character, Integer> Roman = new HashMap();
        Roman.put('I', 1);
        Roman.put('V', 5);
        Roman.put('X', 10);
        Roman.put('L', 50);
        Roman.put('C', 100);
        Roman.put('D', 500);
        Roman.put('M', 1000);
        
        temp = Roman.get(s.charAt(0));
            
        for (int i = 1; i < s.length(); i++) {
            current = Roman.get(s.charAt(i));
            if(temp < current) 
                accumulator -= temp;   
            else 
                accumulator += temp;

            temp = current;
        }
        
        return accumulator + temp;
        
    }
}
```
