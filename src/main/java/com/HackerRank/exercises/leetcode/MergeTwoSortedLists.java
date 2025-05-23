package com.HackerRank.exercises.leetcode;

import static java.util.Objects.isNull;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
        mergeTwoSortedLists.mergeTwoLists(list1, list2);
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (isNull(list1)) return list2;
        if (isNull(list2)) return list1;

        ListNode primero;
        if (list1.val < list2.val) {
            primero = list1;
            list1 = list1.next;
        } else {
            primero = list2;
            list2 = list2.next;
        }

        ListNode actual = primero;

        while (!isNull(list1) &&  !isNull(list2)) {
            if (list1.val < list2.val) {
                actual.next = list1;
                list1 = list1.next;
            } else {
                actual.next = list2;
                list2 = list2.next;
            }
            actual = actual.next;
        }

        if (!isNull(list1)) {
            actual.next = list1;
        } else {
            actual.next = list2;
        }

        return primero;
    }
}