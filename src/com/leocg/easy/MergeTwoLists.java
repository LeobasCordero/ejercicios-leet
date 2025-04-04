package com.leocg.easy;

import com.leobas.impresion.Impresion;
import com.leobas.objects.ListNode;


import static com.leocg.utils.Utils.imprimirTitulo;

/**
 * You are given the heads of two sorted linked lists list1 and list2.
 *
 * Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
 *
 * Return the head of the merged linked list.
 *
 *
 *
 * Example 1:
 *
 *
 * Input: list1 = [1,2,4], list2 = [1,3,4]
 * Output: [1,1,2,3,4,4]
 * Example 2:
 *
 * Input: list1 = [], list2 = []
 * Output: []
 * Example 3:
 *
 * Input: list1 = [], list2 = [0]
 * Output: [0]
 *
 *
 * Constraints:
 *
 * The number of nodes in both lists is in the range [0, 50].
 * -100 <= Node.val <= 100
 * Both list1 and list2 are sorted in non-decreasing order.
 */
public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        imprimirTitulo("Merge Two Lists");
        Impresion.impresionNormal("Input: ");
        Impresion.imprimirLista(l1);
        Impresion.imprimirLista(l2);

        ListNode res = new ListNode();
        ListNode l3 = res;

        if(l1 == null && l2 == null) {
            Impresion.impresionNormal("Output: ");
            return null;
        }

        if(l1 == null) {
            Impresion.impresionNormal("Output: ");
            return l2;
        }

        if( l2 == null) {
            Impresion.impresionNormal("Output: ");
            return l1;
        }

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val) {
                l3.val = l1.val;
                l1 = l1.next;
            }else {
                l3.val = l2.val;
                l2 = l2.next;
            }
            l3.next = new ListNode();
            l3 = l3.next;
        };

        if(l2 != null) {
            l3.val = l2.val;
            l3.next = l2.next;
        }

        if(l1 != null) {
            l3.val = l1.val;
            l3.next = l1.next;
        }

        Impresion.impresionNormal("Output: ");
        return res;
        /*
        ListNode dummy = new ListNode(-1); // Nodo dummy para simplificar la lógica
    ListNode current = dummy;

    while (l1 != null && l2 != null) {
        if (l1.val <= l2.val) {
            current.next = l1;
            l1 = l1.next;
        } else {
            current.next = l2;
            l2 = l2.next;
        }
        current = current.next;
    }

    // Conectar el resto de la lista no vacía
    current.next = (l1 != null) ? l1 : l2;

    return dummy.next;
         */
    }
}
