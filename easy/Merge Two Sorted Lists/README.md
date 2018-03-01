# Merge Two Sorted Lists

Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.

## Solution
```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        
        ListNode merge = new ListNode(-1), temp;
        temp = merge;
        
        while(true) {
            
            if(l1.val < l2.val) {
                temp.next = l1;
                temp = temp.next;
                
                if(l1.next == null) {
                    temp.next = l2;
                    break;
                }
                
                l1 = l1.next;
            } else {
                temp.next = l2;
                temp = temp.next;
                
                if(l2.next == null) {
                    temp.next = l1;
                    break;
                }
                
                l2 = l2.next;
            }  
        }
        
        return merge.next;
    }
}
```
