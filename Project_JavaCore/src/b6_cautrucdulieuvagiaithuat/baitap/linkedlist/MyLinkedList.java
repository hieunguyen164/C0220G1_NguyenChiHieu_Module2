package b6_cautrucdulieuvagiaithuat.baitap.linkedlist;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes = 0;

    public MyLinkedList() {

    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void addFirst(E element) {
        Node temp = head;
        head = new Node(element);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E element) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(element);
        numNodes++;
    }

    public void add(int index, E element) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(element);
        temp.next.next = holder;
        numNodes++;
    }

    public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.data;
    }

    public int size() {
        return numNodes;
    }

    public E remove(int index) {
        if (index < 0 || index >= numNodes) {
            throw new IllegalArgumentException("Invalid index");
        }
        Node temp = head;
        E data;
        if (index == 0) {
            data = (E) temp.data;
            head = head.next;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = (E) temp.next.data;
            temp.next = temp.next.next;
            numNodes--;
        }
        return data;
    }

    public boolean remove (E element) {
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data.equals(element)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
                temp = temp.next;
            }
        return false;
    }

    public MyLinkedList<E> clone(){
        if(numNodes == 0){
            throw new NullPointerException("List is null");
        }
        MyLinkedList<E> returnLinkedList = new MyLinkedList<>();
        Node temp = head;
        returnLinkedList.addFirst((E)temp.data);
        temp = temp.next;
        while (temp != null){
            returnLinkedList.addLast((E)temp.data);
            temp = temp.next;
        }
        return returnLinkedList;
    }

    public boolean constains(E element){
        Node temp = head;
        while (temp.next != null){
            if(temp.data.equals(element)){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int indexOf(E element){
        Node temp = head;
        for( int i = 0; i < numNodes; i++){
            if(temp.data.equals(element)){
                return i;
            }
            temp = temp.next;
        }
        return -1;
    }



    public E getFirst(){
        return (E)head.data;
    }

    public E getLast(){
        Node temp = head;
        for(int i = 0;i<numNodes-1;i++){
            temp = temp.next;
        }
        return (E)temp.data;
    }

    public void clear(){
        head = null;
    }


}
