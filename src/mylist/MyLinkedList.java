package mylist;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;


public class MyLinkedList<E> implements ILinkedList {

    private int size;
    private Node<E> head;
    private static final long serialVersionUID = 8345231412454627L;

    //inner class Node
    private static class Node<E>{
        private E element;
        private Node next;

        public Node(E element){
            this.element = element;
            this.next = null;
        }

        public E getElement(){
            return element;
        }

        public void setElement(E d){
            element = d;
        }

        public Node getNext(){
            return next;
        }

        public void setNext(Node n){
            next = n;
        }

    }

    //default constructor
    public MyLinkedList(){
        this.size=0;

    }

    //construct with other collection
    public MyLinkedList(Collection<? extends E> c){
        this();
        //for(Object k : c);
    }

    //searching by index
    Node node(int index) {
        Node x = this.head;
        int i;
        for(i = 0; i < index; ++i) {
            x = x.next;
        }

        return x;
    }

    @Override
    public void add(Object element){
        if(head == null){
            head = new Node(element);
        }else{
            Node newNode = new Node(element);
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.setNext(newNode);
        }

        ++this.size;
    }

    @Override
    public void add(int index, Object element) {
        if(index==this.size){
            add(element);
        } else {
            Node newNode = new Node(element);
            newNode.next=node(index);
            node(index-1).next = newNode;
        }

        ++this.size;
    }

    @Override
    public void clear() {
        Node next;
        for(Node x = this.head; x!=null; x = next){
            next =x.next;
            x.element = null;
            x.next = null;
        }

        this.size = 0;
    }

    @Override
    public Object get(int index) {
        return this.node(index).element;
    }

    @Override
    public int indexOf(Object element) {
        int index = 0;
        Node x;
        if(element==null){
            for(x = this.head;x!=null;x=x.next){
                if(x.element==null){
                    return index;
                }

                ++index;
            }
        }else{
            for(x = this.head;x!=null;x=x.next){
                if(element.equals(x.element)){
                    return index;
                }

                ++index;
            }
        }
        return -1;
    }

    @Override
    public Object remove(int index) {
        Node pred = node(index-1);
        pred.next = node(index+1);
        size--;
        return node(index);
    }


    @Override
    public Object set(int index, Object element) {
        Node x = this.node(index);
        Object oldVal = x.element;
        x.element = element;
        return oldVal;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[this.size];
        int i = 0;

        for(MyLinkedList.Node x = this.head;x!= null;x = x.next){
            result[i++]=x.element;
        }

        return result;
    }

    @Override
    public String toString(){
        Iterator<E> it = iterator();
        if (! it.hasNext())
            return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (;;) {
            E e = it.next();
            sb.append(e);
            if (! it.hasNext())
                return sb.append(']').toString();
            sb.append(", ");
        }
    }


    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            private Node<E> current = head;

            @Override
            public boolean hasNext() {
                return current.getNext() != null;
            }

            @Override
            public E next() {
                E element = current.element;
                current = current.next;
                return element;
            }
        };
    }
}
