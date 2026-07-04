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
    public ListNode reverseList(ListNode head) {
         if(head==null){
        System.out.println("list is empty");
        return null;
     }
     ListNode prev = null;
     ListNode curr = head;
     ListNode currtemp = head.next;

     while(curr.next!=null){
        curr.next = prev;
       
       prev = curr;
       curr = currtemp;
         currtemp = currtemp.next;
     }
     curr.next = prev;
     return curr;
        }
        
    }

