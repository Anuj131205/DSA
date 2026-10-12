/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode tar) { // node = target(tar) le liya hai
        tar.val = tar.next.val;
        tar.next = tar.next.next;
    }
}