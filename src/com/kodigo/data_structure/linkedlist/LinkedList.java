package com.kodigo.data_structure.linkedlist;

public class LinkedList implements ILinkedList{

    public Link firstLink;

    @Override
    public boolean isEmpty() {
        return firstLink.next == null;
    }

    @Override
    public void insertFirstLink(String bookName, int millionSold) {
        Link newLink = new Link(bookName, millionSold);
        newLink.next = firstLink;
        firstLink = newLink;
    }

    @Override
    public Link removeFirst() {
        if(isEmpty()) {
            return null;
        } else {
            Link removedLink = firstLink;
            firstLink = firstLink.next;
            return removedLink;
        }
    }

    @Override
    public void display() {
        Link theLink = firstLink;
        while(theLink != null) {
            theLink.display();
            System.out.println("Next Link: " + theLink.next);
            theLink = theLink.next;
            System.out.println();
        }
    }

    @Override
    public Link find(String bookName) {
        Link traverseLink = firstLink;

        while(traverseLink != null) {
            if(traverseLink.bookName.equals(bookName)) {
                return traverseLink;
            }
        }
        return traverseLink;
    }

    @Override
    public Link removeLink(String bookName) {
        Link currentLink = firstLink;
        Link previousLink = firstLink;

        while(currentLink.bookName != bookName) {

            if(currentLink == null) {
                return null;
            } else {
                previousLink = currentLink;
                currentLink = currentLink.next;
            }
        }
        if(currentLink == firstLink) {
            firstLink = firstLink.next;
        } else {
            System.out.println("FOUND A MATCH");
            System.out.println("currentLink: " + currentLink);
            System.out.println("firstLink: " + firstLink);

            previousLink.next = currentLink.next;

        }
        return currentLink;
    }

}
