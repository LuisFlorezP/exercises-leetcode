package org.example.easy.MergeTwoSortedLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedLists {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> list = new ArrayList<>();
        ListNode node1 = null, node2 = null;
        if (list1 != null) {
            while (true) {
                if (list1.next == null) {
                    list.add(list1.val);
                    break;
                }
                list.add(list1.val);
                list1 = list1.next;
            }
        }
        if (list2 != null) {
            while (true) {
                if (list2.next == null) {
                    list.add(list2.val);
                    break;
                }
                list.add(list2.val);
                list2 = list2.next;
            }
        }
        Collections.sort(list);
        Collections.reverse(list);
        for (Integer number : list) {
            node2 = new ListNode(number, node1);
            node1 = node2;
        }
        return node1;
    }
}
