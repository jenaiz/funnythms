package com.jenaiz.datastructures;

/**
 * Node that store a value (type Object) and get a link to the next node.
 *
 * @author jesus.navarrete  (17/06/14)
 */
public class Node {

    private Object value;

    private Node next;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
