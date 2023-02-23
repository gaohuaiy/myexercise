package jianzhioffer.day2.code35;

import java.util.HashMap;

/* 
 * 
 * 剑指 Offer 35. 复杂链表的复制
 * 请实现 copyRandomList 函数，
 * 复制一个复杂链表。在复杂链表中，
 * 每个节点除了有一个 next 指针指向下一个节点，
 * 还有一个 random 指针指向链表中的任意节点或者 null。
 * 
 */


class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

    @Override
    public String toString() {
        return "Node [val=" + val + ", next=" + next + ", random=" + random + "]";
    }

    
}

class Solution {
    HashMap<Node, Node> hashMap = new HashMap<>();

    public Node copyRandomList(Node head) {
        if(head == null) return null;
        if(!hashMap.containsKey(head)){
            Node newNode = new Node(head.val);
            hashMap.put(head, newNode);
            newNode.next = copyRandomList(head.next);
            newNode.random = copyRandomList(head.random);
        }
        return hashMap.get(head);
    }
}

public class test {
    public static void main(String[] args) {


        Node node = new Node(0);
        node.next = new Node(1);
        node.next.next = new Node(2);

        // new Solution().copyRandomList(node);
        System.out.println("test.main()"+new Solution().copyRandomList(node).toString());
        // System.out.println(node);
    }
}
