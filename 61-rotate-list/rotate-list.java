/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Step 1: Find length of linked list
        int len = 1;
        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
            len++;
        }

        // Step 2: Handle k greater than length
        k = k % len;

        if (k == 0) {
            return head;
        }

        // Step 3: Initialize slow and fast pointers
        ListNode slow = head;
        ListNode fast = head;

        // Move fast k steps ahead
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }

        // Step 4: Move both pointers
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Step 5: Divide list into two parts
        ListNode a = slow.next;
        slow.next = null;

        // Step 6: Connect last node of second part to head
        fast.next = head;

        // Step 7: Return new head
        return a;
    }
}






 /*
class Solution {
    public int length(ListNode head){
        int len = 0;
        ListNode temp = head;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        return len;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        int n = length(head);
        k %= n;
        if(k == 0) return head;
        ListNode slow = head;
        ListNode fast = head;
        for(int i = 1; i <= k+1; i++){
            fast = fast.next;
        }
        while(fast !=  null){
            slow = slow.next;
            fast = fast.next;
        }
        ListNode a = slow.next; 
        slow.next = null; // Abha meri list 2 part ma divide ho gayi hai 1 and 2 line sa
        ListNode temp = a; 
        while(temp.next != null) {
        temp = temp.next;
        }
        temp.next = head;
        return a;
    }
} 
*/