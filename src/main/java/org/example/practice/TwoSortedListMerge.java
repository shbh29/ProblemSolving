package org.example.practice;

class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

public class TwoSortedListMerge {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        /**
         loop while both list are not empty
         if list1 of head is smaller than list2 of head
         add the ListNode to your list. point to next node.
         loop while fist list is not empty
         loop while second list is not empty
         */
        ListNode head = null;
        ListNode current = null;

        while(list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                if (head == null) {
                    head = new ListNode(list1.val, null);
                    current = head;
                } else {
                    if(current != null) {
                        ListNode temp = new ListNode(list1.val, null);
                        current.next = temp;
                        current = temp;
                    } else {
                        throw new IllegalStateException("Illegal State List");
                    }
                }
                list1 = list1.next;
            } else {
                if (head == null) {
                    head = new ListNode(list2.val, null);
                    current = head;
                } else {
                    if(current != null) {
                        ListNode temp = new ListNode(list2.val, null);
                        current.next = temp;
                        current = temp;
                    } else {
                        throw new IllegalStateException("Illegal State List");
                    }
                }
                list2 = list2.next;
            }
        }

        while(list1 != null) {
            if (head == null) {
                head = new ListNode(list1.val, null);
                current = head;
            } else {
                if(current != null) {
                    ListNode temp = new ListNode(list1.val, null);
                    current.next = temp;
                    current = temp;
                } else {
                    throw new IllegalStateException("Illegal State List");
                }
            }
            list1 = list1.next;
        }

        while(list2 != null) {
            if (head == null) {
                head = new ListNode(list2.val, null);
                current = head;
            } else {
                if(current != null) {
                    ListNode temp = new ListNode(list2.val, null);
                    current.next = temp;
                    current = temp;
                } else {
                    throw new IllegalStateException("Illegal State List");
                }
            }
            list2 = list2.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(7, null))));
        ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(6, null)));
//        System.out.println(new TwoSortedListMerge().mergeTwoLists(list1, list2));
//        System.out.println(new TwoSortedListMerge().mergeTwoLists(null, null));
//        System.out.println(new TwoSortedListMerge().mergeTwoLists(new ListNode(), new ListNode()));
        System.out.println(new TwoSortedListMerge().mergeTwoLists(null, new ListNode(0)));

    }
}
