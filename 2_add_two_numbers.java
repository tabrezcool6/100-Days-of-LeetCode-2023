import java.util.*;

class AddTwoNumbers{
   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode(0);
        ListNode pointer = resultNode;

        int carry = 0;

        while(l1!=null || l2!=null){
            int sum = 0 + carry;
            if(l1!=null){
                sum = sum + l1.val;
                l1 = l1.next;
            }

            if(l2!=null){
                sum = sum + l2.val;
                l2 = l2.next;
            }

            carry = sum/10;
            sum = sum%10;
            pointer.next = new ListNode(sum);
            pointer = pointer.next;
        }

        if(carry == 1) pointer.next = new ListNode(carry);

        return resultNode.next;
    }
}
