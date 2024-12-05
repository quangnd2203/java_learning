package collection.linked_list;

import java.util.function.Function;

public class LinkedList<T> {
    private Node<T> head;

    public int getSize() {
        return size;
    }

    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void traverse() {
        Node<T> current = this.head;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public void addFirst(T data) {
        this.head = new Node<>(data, this.head);
        this.size = this.size + 1;
    }

    public void addLast(T data) {
        Node<T> current = this.head;
        if (current == null) {
            this.head = new Node<>(data, null);
        } else {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(new Node<>(data, null));
        }
        this.size = this.size + 1;
    }

    public boolean addAfter(T key, T data) {
        Node<T> current = this.head;
        while (current != null && !current.getData().equals(key)) {
            current = current.getNext();
        }
        if (current != null) {
            current.setNext(new Node<>(data, current.getNext()));
            this.size = this.size + 1;
            return true;
        }
        return false;
    }

    public boolean delete(T key) {
        Node<T> current = this.head;
        Node<T> previous = null;
        while (current != null && !current.getData().equals(key)) {
            previous = current;
            current = current.getNext();
        }
        if (current != null) {
            if (previous != null) {
                previous.setNext(current.getNext());
            } else {
                this.head = current.getNext();
            }
            this.size = this.size - 1;
            return true;
        }
        return false;
    }

    public T find(T key) {
        Node<T> current = this.head;
        while (current != null && !current.getData().equals(key)) {
            current = current.getNext();
        }
        return current != null ? current.getData() : null;
    }

    public T findWhere(Function<T, Boolean> callback) {
        Node<T> current = this.head;
        while (current != null && !callback.apply(current.getData())) {
            current = current.getNext();
        }
        return current != null ? current.getData() : null;
    }

    public void forEach(Function<T, Void> callback) {
        Node<T> current = this.head;
        while (current != null) {
            callback.apply(current.getData());
            current = current.getNext();
        }
    }
}
