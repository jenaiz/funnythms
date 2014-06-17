package com.jenaiz.datastructures;
/**
 *
 * Dummy single Linked List implementation
 * @author jesus.navarrete  (17/06/14)
 */
public class DummyLinkedList {

    private Node head;

    public DummyLinkedList() {
    }

    public void addNode(final Node node) {
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(node);
        }

    }

    /*public void removeNode(final Node node) {
        if (head == node) {
            head = head.getNext();
        } else {
            Node current = head;
            while (current != null) {
                if (current.getNext() == node.getNext()) {
                    current.getNext() = current.getNext().getNext();
                    break;
                }
            }
        }
    }*/

    public Node getHead() {
        return head;
    }

}
