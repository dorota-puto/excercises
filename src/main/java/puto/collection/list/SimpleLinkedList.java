package puto.collection.list;

import puto.collection.filters.IFilter;

import java.util.Iterator;

public class SimpleLinkedList<T> implements Iterable<T> {
    private Node<T> head;
    private Node<T> tail;

    public void add(T value) {
        if (head == null) {
            head = new Node<>();
            tail = head;
            head.setValue(value);
        } else {
            Node<T> tmp = new Node<>();
            tail.setNext(tmp);
            tail = tmp;
            tmp.setValue(value);
        }
    }

    public int size() {
        if (head == null) {
            return 0;
        }
        Node<T> tmp = head;
        int counter = 1;
        while (tmp != tail) {
            counter++;
            tmp = tmp.getNext();
        }
        return counter;
    }

    public T get(int index) {
        if (index >= size() || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Don't be fool, man!");
        }
        Node<T> tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.getNext();
        }
        return tmp.getValue();
    }

    public void remove(int index) {
        Node<T> tmp1 = head;
        Node<T> tmp2 = head;
        int size = size();
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Don't be fool, man!");
        }
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            for (int i = 0; i < index - 1; i++) {
                tmp1 = tmp1.getNext();
            }
            for (int i = 0; i < index + 1; i++) {
                tmp2 = tmp2.getNext();
            }
            if (index == 0) {
                head = tmp2;
            }
            if (index + 1 == size) {
                tail = tmp1;
            } else {
                tmp1.setNext(tmp2);
            }
        }
    }

    @Override
    public String toString() {
        if (head == null) {
            return "";
        }
        String result = "";
        Node<T> tmp = head;
        while (tmp != null) {
            result = result + "(" + tmp.getValue() + ")--->";
            tmp = tmp.getNext();
        }
        return result;
    }

    public SimpleLinkedList<T> filterList(IFilter<T> filter) {
        Node<T> tmp = head;
        SimpleLinkedList<T> filteredList = new SimpleLinkedList<>();
        while (tmp != null) {
            if (filter.isIncluded(tmp.getValue())) {
                filteredList.add(tmp.getValue());
            }
            tmp = tmp.getNext();
        }
        return filteredList;
    }
    public int firstIndexOf(T value){
        Node<T> tmp = head;
        int counter=0;
        while (tmp != null) {
            if (value.equals(tmp.getValue())) {
               return counter;
            }
            tmp = tmp.getNext();
            counter++;
        }
        return -1;
    }

    @Override
    public Iterator<T> iterator() {

        return new SimpleLinkedListIterator<>(head) ;
    }
}

