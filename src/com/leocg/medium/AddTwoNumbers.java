package com.leocg.medium;

import com.leobas.objects.ListNode;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode result = res;
        int aux = 0;

        while(l1 != null && l2 != null){
            res.next = new ListNode();
            res = res.next;

            if(aux != 0){
                res.val = l1.val + l2.val + aux;
                aux = 0;
            }else{
                res.val = l1.val + l2.val;
            }

            l1 = l1.next;
            l2 = l2.next;

            if(res.val >= 10){
                res.val = res.val%10;
                aux = 1;
            }

            if(l1 == null){
                res.next = l2;
                break;
            }

            if(l2 == null){
                res.next = l1;
                break;
            }

        }

        if(aux != 0){
            res.next = new ListNode(aux, null);
        }

        return result.next;
    }
}
