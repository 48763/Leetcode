# Two Sun

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

**Example:**
```
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
```

## Solution
- [Java](#java)
- [JavaScript](#javascript)
- [C](#)

## Java

### Code
```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
    int[] arr_pt = new int[60000];
    int result = 0;
    int offset = 10000;
    
    for(int i = 0; i < nums.length; i++) {
        arr_pt[nums[i] + offset] = i;
    }
    
    for(int i = 0; i < nums.length; i++) {
        if (arr_pt[target - nums[i] + offset] != 0) {
            result = i;
            break;
        }
    }
        
    return new int[]{result, arr_pt[target - nums[result] + offset]};
    }
}
```
### Rating
<img src="./rating-java-01.png" alt="java" height="100%" width="100%">

## JavaScript

### Code

```javascript
/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {

    var map = {};
    
    for(var i in nums) {
        if(map[target-nums[i]] >= 0) {  
            return [map[target-nums[i]], +i];
        }
        
        map[nums[i]] = +i;
    }
};
```
### Rating
<img src="./rating-javascript-01.png" alt="java" height="100%" width="100%">