package com.jenaiz.datastructures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 *
 * Dummy single Linked List implementation
 * @author jesus.navarrete  (17/06/14)
 */
public class DummyLinkedListTest {

    private DummyLinkedList dummy;

    @Before
    public void setUp() throws Exception {
        dummy = new DummyLinkedList();

    }

    @Test
    public void testAddNode() {

        final Node node = new Node();
        dummy.addNode(node);

        assertTrue(dummy.getHead() != null);
        assertTrue(dummy.getHead() == node);

    }

    @Test
    public void testAddNode_twoNodes() throws Exception {
        final Node node = new Node();
        dummy.addNode(node);

        final Node node1 = new Node();
        dummy.addNode(node1);

        assertTrue(dummy.getHead() == node);
        assertTrue(dummy.getHead().getNext() == node1);

    }
}
