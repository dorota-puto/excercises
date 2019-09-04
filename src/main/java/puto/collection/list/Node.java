package puto.collection.list;

public class Node {
    private String value;
    private Node next;

    public void setValue(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext() {
        return next;
    }
}
