package org.example;

public class CustomLinkedList {
    Node head;
    private Node tail;

    CustomLinkedList() {
        this.head = null;
        this.tail = null;
    }

    void addStage(Stage stage) {
        Node newNode = new Node(stage);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    Stage removeLast() {
        if (tail == null) {
            return null;
        }

        Node lastNode = tail;
        tail = lastNode.prev;

        if (tail == null) {
            head = null;
        } else {
            tail.next = null;
        }

        return lastNode.stage;
    }

    Stage getLast() {
        return (tail != null) ? tail.stage : null;
    }
}


