package module1.task1;

import java.util.Collection;

public class MyLinkedList<K> {

    private int size = 0;
    private Node<K> firstElement = null;
    private Node<K> lastElement = null;

    private static class Node<K> {
        K element;
        Node<K> pred;
        Node<K> next;

        Node (K value, Node<K> previous, Node<K> next) {
            this.element = value;
            this.pred = previous;
            this.next = next;
        }

        public K getValue() {
            return element;
        }
    }

    public void addFirst(K element) {
        Node<K> oldFirstNode = firstElement;
        Node<K> newNode = new Node<>(element, null, oldFirstNode);
        firstElement = newNode;

        if (oldFirstNode == null) {
            lastElement = newNode;
        } else {
            oldFirstNode.pred = newNode;
        }
        size++;
    }

    public void addLast(K element) {
        Node<K> oldLastNode = lastElement;
        Node<K> newNode = new Node<>(element, oldLastNode, null);
        lastElement = newNode;

        if (oldLastNode == null) {
            firstElement = newNode;
        } else {
            oldLastNode.next = newNode;
        }
        size++;
    }

    public void add(K element) {
        addLast(element);
    }

    public void add(K element, int index) {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            addFirst(element);
        } else if (index == size) {
            addLast(element);
        }else {
            Node<K> oldIndexElement = getNode(index);
            Node<K> newNode = new Node<>(element, oldIndexElement.pred, oldIndexElement);
            oldIndexElement.pred.next = newNode;
            oldIndexElement.pred = newNode;
            size++;
        }
    }

    public void addAll(Collection<K> elements) {
        addAll(elements, size);
    }

    public void addAll(Collection<K> elements, int index) {
        Object[] a = elements.toArray();
        int numNew = a.length;
        if (numNew == 0)
            return;

        Node<K> pred;
        Node<K> next;
        if (index == size) {
            next = null;
            pred = lastElement;
        } else {
            next = getNode(index);
            pred = next.pred;
        }

        for (Object o : a) {
            K e = (K) o;
            Node<K> newNode = new Node<>(e, pred, null);
            if (pred == null)
                firstElement = newNode;
            else
                pred.next = newNode;
            pred = newNode;
        }

        if (next == null) {
            lastElement = pred;
        } else {
            pred.next = next;
            next.pred = pred;
        }

        size += numNew;
    }

    public K get(int index) {
        return getNode(index).element;
    }

    private Node<K> getNode(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node<K> check = firstElement;
        for (int i = 0; i != index; i++) {
            check = check.next;
        }
        return check;
    }

    public void remove(int index) {
        Node<K> removeNode = getNode(index);
        Node<K> pred = removeNode.pred;
        Node<K> next = removeNode.next;

        if (pred == null) {
            firstElement = next;
        } else {
            pred.next = next;
        }

        if (next == null) {
            lastElement = pred;
        } else {
            next.pred = pred;
        }


        size--;
    }

    public int getSize() {
        return size;
    }

    public Node<K> getFirstElement() {
        return firstElement;
    }

    public Node<K> getLastElement() {
        return lastElement;
    }
}
