package DataStructures;


import java.util.NoSuchElementException;

public class Dequeue {
    /* A Linked List based implementation of Dequeue (Double Ended Queue)
     *
     * A Dequeue is just like a normal Queue, except you can push
     * and pop from both the front and the back.
     *
     * Please use the Link.java class provided for you.
     *
     * */

    /* HINT: You should use 2 sentinel nodes to mark the start and end of the queue
        similar to our sentinel node trick in HW 1.
     */

    private Link sentHead;
    private Link sentTail;
    private int size;


    public Dequeue() {
        // YOUR CODE HERE
        sentHead = null ;
        size = 0;
        sentTail = null ;



    }

    public void addFirst(int value) {
        // YOUR CODE


        Link lnk = new Link(value);
        size++;
        if(size == 1) {
            sentTail = lnk;
            sentHead = lnk;
        }
        lnk.next = sentHead;
        sentHead = lnk;








    }

    public void addLast(int value) {
        // YOUR CODE HERE

        Link lnk = new Link(value);
        size++;
        if(size == 1){
            sentTail = lnk;
            sentHead = lnk;
        }
        sentTail.next = lnk;
        sentTail = lnk;



    }

    public int removeFirst() {
        // YOUR CODE HERE

        int value = 0;

        if(size==0){
            throw new NoSuchElementException();

        }

        value = sentHead.value;

        if(size==1){
            sentTail = null;
            sentHead = null;


        }
        else {
            sentHead = sentHead.next;


        }


        size--;
        return value;

    }

    public int removeLast() {
        // YOUR CODE HERE
        int value = 0;

        if(size==0){
            throw new NoSuchElementException();

        }

        value = sentTail.value;

        if(size==1) {
            sentTail = null;
            sentHead = null;

        }

        else {
            sentTail = sentHead;
            for(int i =0; i < size - 2; i++) {
                sentTail = sentTail.next;

            }
            sentTail.next = null;






        }
        size--;
        return value;
    }


    public int getSize() {
        // YOUR CODE HERE

        return size;
    }


    public boolean isEmpty() {
        // YOUR CODE HERE

            if(size==0){
                return true;

            }
            return false;
    }



    public int get(int index) {
        // YOUR CODE HERE
        if (index > size || index < 0) {
            throw new IllegalArgumentException();
        }


        Link newPointer = sentHead;


        int value = 0;

        for(int i =0; i < index; i++){

            newPointer = newPointer.next;
        }

        value = newPointer.value;
        return value;

    }


}