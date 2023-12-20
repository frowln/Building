package org.example;

public class Node {
    Stage stage;
    Node next;
    Node prev;

    Node(Stage stage) {
        this.stage = stage;
        this.next = null;
        this.prev = null;
    }
}
