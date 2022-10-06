/**
 * Definition for singly-linked list.
 * class ListNode(_x: Int = 0, _next: ListNode = null) {
 *   var next: ListNode = _next
 *   var x: Int = _x
 * }
 */
object Solution {
    def mergeTwoLists(list1: ListNode, list2: ListNode): ListNode = {
        var head1 = list1;
        var head2 = list2;
        var ansHead = new ListNode();
        var head3 = ansHead;
        while(head1 != null && head2 != null){
            var h1Val = head1.x;
            var h2Val = head2.x;
            
            if(h1Val < h2Val) {
                head3.next = head1;
                head3 = head3.next;
                head1 = head1.next;
            }
            else {
                head3.next = head2;
                head3 = head3.next;
                head2 = head2.next;
            }
        }
        
        while(head1 != null){
            head3.next = head1;
            head3 = head3.next;
            head1 = head1.next;
        }
        
        while(head2 != null){
            head3.next = head2;
            head3 = head3.next;
            head2 = head2.next;
        }
        
        return ansHead.next;
    }
}