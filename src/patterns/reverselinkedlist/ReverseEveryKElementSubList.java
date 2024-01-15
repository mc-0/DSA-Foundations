package patterns.reverselinkedlist;

import datastructures.linkedlists.ListNode;

public class ReverseEveryKElementSubList {

    public static ListNode reverse(ListNode head, int k) {
        // If k is 1 or less - every sublist would be size 1, so no reversal needs to happen, same if list is empty
        if (k <= 1 || head == null) {
            return head;
        }
        ListNode current = head, previous = null;
        while (true) {
            ListNode lastNodeOfPrevPart = previous; // Copy the last node of the previous list, so it can connect to new sublist
            ListNode lastNodeOfSubList = current; // Copy what will become the last node of the reversed list
            ListNode next = null;

            // Reverse the list, using 'i' to count up to k
            for (int i = 0; i < k && current != null; i++) {
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }
            // If the last node of the previous portion of the list is NOT null, connect it to the next portion
            if (lastNodeOfPrevPart != null) {
                lastNodeOfPrevPart.next = previous;
            }
            // If the last node of the previous portion if the list IS NULL: set head to previous
            // This step occurs on 1st reversal iteration: where head is the 1st node of the 1st reversed sub list
            else {
                head = previous;
            }
            // reconnect the last node of the newly reversed list to the list
            lastNodeOfSubList.next = current;

            // if current is null, we've reached the end of the list & need to break out of the loop
            // if we don't do this, infinite while loop
            if (current == null) {
                break;
            }
            // set previous to be the end of the last list, marks the end of the reversal / reconnection process
            previous = lastNodeOfSubList;
        }

        return head;
    }
}
