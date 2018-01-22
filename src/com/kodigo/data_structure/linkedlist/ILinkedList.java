package com.kodigo.data_structure.linkedlist;

public interface ILinkedList {

    boolean isEmpty();
    void insertFirstLink(String bookName, int millionSold);
    Link removeFirst();
    void display();
    Link find(String bookName);
    Link removeLink(String bookName);

}
