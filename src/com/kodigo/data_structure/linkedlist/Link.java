package com.kodigo.data_structure.linkedlist;

public class Link {
    public String bookName;
    public int millionSold;
    public Link next;

    public Link(String bookName, int millionSold) {
        this.bookName = bookName;
        this.millionSold = millionSold;
    }

    public void display() {
        System.out.println(bookName + ": " + millionSold + ",000,000 Sold");

    }

    @Override
    public String toString() {
        return bookName;
    }

    public static void main(String[] args) {
        LinkedList theLinkedList = new LinkedList();

        theLinkedList.insertFirstLink("Don Quixote", 500);
        theLinkedList.insertFirstLink("A Tale of Two Cities", 200);
        theLinkedList.insertFirstLink("The Lord of the Rings", 150);
        theLinkedList.insertFirstLink("Harry Potter and the Sorcerer's Stone", 107);

        theLinkedList.display();

        System.out.println("Value of first in LinkedList " + theLinkedList.firstLink + "\n");
        theLinkedList.removeFirst();
        theLinkedList.display();


        System.out.println(theLinkedList.find("The Lord of the Rings").bookName + " Was Found");

        Link removedLink = theLinkedList.removeLink("A Tale of Two Cities");

        System.out.println(removedLink + " was removed");


    }
}
