package prep60.stack;
public class Q7_206ReverseLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(0, null);
        ListNode cur = head;
        for(int i = 1;i<5;i++)
        {
            ListNode n = new ListNode(i, null);
            cur.next = n;
            cur = cur.next;
        }
        Solution s = new Solution();
        head = s.reverseList(head);
        cur = head;
        for(int i = 0; i<5;i++)
        {
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode new_head = new ListNode(head.val, null), cur;
        if(head.next!=null) {
            cur = head.next;
        }
        else {
            return head;
        }
        new_head = head;
        new_head.next = null;
        while(cur!=null){
            head = cur;
            cur = head.next;
            head.next = new_head;
            new_head = head;
        }
        return new_head;
    }
}
