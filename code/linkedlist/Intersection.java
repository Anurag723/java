class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class Intersection {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // Implementation goes here

        if(headA==null || headB==null) return null;
        ListNode pointA = headA;
        ListNode pointB = headB;

        while (pointA!=pointB) {
            if(pointA!=null){
                pointA = pointA.next;
            }
            else{
                pointA = headB;
            }
            if(pointB!=null){
                pointB = pointB.next;
            }
            else{
                pointB = headA;
            }
        }

        return pointA;
    }

    public static void main(String[] args) {
        // Create test nodes
        ListNode common = new ListNode(8);
        common.next = new ListNode(10);

        ListNode headA = new ListNode(3);
        headA.next = new ListNode(7);
        headA.next.next = common;

        ListNode headB = new ListNode(99);
        headB.next = new ListNode(1);
        headB.next.next = common;

        Intersection intersection = new Intersection();
        ListNode result = intersection.getIntersectionNode(headA, headB);

        if (result != null) {
            System.out.println("Intersection at node with value: " + result.val);
        } else {
            System.out.println("No intersection.");
        }
    }
}
