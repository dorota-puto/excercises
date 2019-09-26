package puto.collection.list;

import java.util.Iterator;

public class SimpleLinkedListIterator<T> implements Iterator<T> {
    private Node<T> head;

    public SimpleLinkedListIterator(Node<T> head) {
        this.head = head;
    }

    @Override
    public boolean hasNext() {
        return head != null;
    }

    @Override
    public T next() {
        Node<T> temp = head;
        if (head==null){
            throw new IllegalStateException("iterator has no more elements");
        }
        head = head.getNext();
        return temp.getValue();

    }
}
