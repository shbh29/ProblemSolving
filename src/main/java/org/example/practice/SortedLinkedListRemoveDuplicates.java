package org.example.practice;

public class SortedLinkedListRemoveDuplicates {
    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }


    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) { return head; }
        ListNode current = head;
        while(current != null && current.next != null) {
            while(current != null && current.next != null && current.val == current.next.val) {
                current.next = current.next.next;
            }
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, null)))));
//        ListNode head = new ListNode(1, new ListNode(1, new ListNode(1, null)));
        System.out.println(head);
        System.out.println(new SortedLinkedListRemoveDuplicates().deleteDuplicates(head));
    }
}
