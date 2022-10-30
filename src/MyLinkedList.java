/*
реализация LinkedList
 */

import java.util.Arrays;

public class MyLinkedList {
    private Node head;
    private int size;

    public void add(int value) {
        if (head == null) {
            this.head = new Node(value);
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node(value));

        }
        size++;
    }

    public String toString() {
        int[] result = new int[size];
        Node temp = head;
        int index = 0;
        while (temp != null) {
            result[index] = temp.getValue();
            index++;
            temp = temp.getNext();
        }
        return Arrays.toString(result);
    }

    public int get(int index) {
        Node temp = head;
        int currentIndex = 0;
        while (temp != null) {
            if (currentIndex == index) {
                return temp.getValue();
            } else {
                temp = temp.getNext();
                currentIndex++;
            }

        }
        throw new IllegalArgumentException();

    }

    public void remove(int index) {
        if (index == 0) {
            head = head.getNext();
            return;
        }
        int correntIndex = 0;
        Node temp = head;
        while (temp != null) {
            if (correntIndex == index - 1) {
                temp.setNext(temp.getNext().getNext());
                break;
            } else {
                temp = temp.getNext();
                correntIndex++;
            }
        }
    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public Node getNext() {

            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
