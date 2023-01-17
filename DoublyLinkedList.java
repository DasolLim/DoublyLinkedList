package LE3Q1;
import java.util.ArrayList;
/*
Node of doubly linked list, which stores a reference to its element
and to both the previous and next node in the list
 */
public class DoublyLinkedList <E>{
    public static class Node<E>{
        private E element;      //element stored at this node
        private Node<E> prev;   //reference to the previous node
        private Node<E> next;   //reference to the next done
        public Node (E element, Node<E> prev, Node<E> next){
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
        //public accessor methods used to return the element, previous node, and next node
        public E getElement() {
            return element;
        }
        public Node<E> getPrev(){
            return prev;
        }
        public Node<E> getNext(){
            return next;
        }

        //used to set the node's previous reference to point to Node n
        public void setPrev(Node<E> p){
            prev = p;
        }
        //set the node's next reference to point to Node n
        public void setNext(Node<E> n){
            next = n;
        }
    }

    //instance variable of the DoublyLinkedList
    private Node<E> header;         //beginning of the list
    private Node<E> trailer;        //last element in the list
    //number of elements in the list
    private int size = 0;

    //empty constructor
    public DoublyLinkedList(){
        header = new Node<>(null, null, null);      //creates header
        trailer = new Node<>(null, header, null);        //trailer is preceded by header
        header.setNext(trailer);                                     //header is followed by trailer
    }
    //return the elements in the linked list
    public int size() {
        return size;
    }
    //test if the list is empty
    public boolean isEmpty(){
        return size == 0;
    }
    //adds element to the end of the list
    public void addLast(E e){
        addBetween(e, trailer.getPrev(), trailer);
    }
    //add element to the linked list in between the given nodes
    //the given predecessor and successor should be neighbouring each other prior to the call
    public void addBetween(E e, Node<E> predecessor, Node<E> successor){
        //create and link a new node
        Node<E> newest = new Node<>(e, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrev(newest);
        size++;
    }
    //return the node containing the element e (or null if empty)
    public Node<E> findNode(E e){
        Node<E> current = header.getNext();     //setting the current header
        while (current.getNext()!=null) {       //checking if the list is empty or not
            if (e == current.getElement()) {    //checking if e is equal to each element in the list
                return current;                 //is so, return the current value
            }
            current = current.getNext();        //used to iterate to the next value
        }
        return null;                            //if not in the list, return null
    }
    //method to print in string representation of the content of the list
    public String toString() {
        ArrayList<E> listArray = new ArrayList<E>();    //using array list
        Node<E> current = header.getNext();             //setting Node<E> type current as header
        int counter = 0;                                //counter for while loop
        while (current.getNext()!=trailer){             //if the next element is not trailer, null, then proceed
            listArray.add(current.getElement());        //adding the current element to the list
            current = current.getNext();                //iterating to the next element
            counter++;                                  //loop again
        }
        listArray.add(current.element);
        return listArray.toString();                    //return the list in string representation
    }
}