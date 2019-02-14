package com.company;

public class LinkedList {

    String str = "";
    String [] arryOfString = str.split("");
    String prev = Node;
    public LinkedList(String str) {
        this.str = str;

    }

    public void  createNodes(String [] arryOfString){
     for (String Item : arryOfString) {

         Node new_node = new Node();

         new_node.next = prev;
     }
    }



}
