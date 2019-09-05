package puto.collection.list;

import puto.collection.filters.IFilter;

public class SimpleLinkedList {
    private Node head;
    private Node tail;

    public void add(String value) {
        if (head == null) {
            head = new Node();
            tail = head;
            head.setValue(value);
        } else {
            Node tmp = new Node();
            tail.setNext(tmp);
            tail = tmp;
            tmp.setValue(value);
        }
    }

    public int size() {
        if (head == null) {
            return 0;
        }
        Node tmp = head;
        int counter = 1;
        while (tmp != tail) {
            counter++;
            tmp = tmp.getNext();
        }
        return counter;
    }

    public String get(int index) {
        if (index >= size() || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Don't be fool, man!");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.getNext();
        }
        return tmp.getValue();
    }

    public void remove(int index) {
        Node tmp1 = head;
        Node tmp2 = head;
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
        Node tmp = head;
        while (tmp != tail) {
            result = result + "(" + tmp.getValue() + ")--->";
            tmp = tmp.getNext();
        }
        result = result + "(" + tmp.getValue() + ")--->";
        return result;
    }

    public SimpleLinkedList filterList(IFilter filter) {
        Node tmp = head;
        SimpleLinkedList filteredList = new SimpleLinkedList();
        while (tmp != null) {
            if (filter.isIncluded(tmp.getValue())) {
                filteredList.add(tmp.getValue());
            }
            tmp = tmp.getNext();
        }
        return filteredList;
    }
}

