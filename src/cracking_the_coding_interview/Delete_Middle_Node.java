/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// Implement an alogirhm to delete a node in the middle (i.e., any node but the first and last node, not necessarily the eaxct middle) of a singly linked list given access to only that node.
package cracking_the_coding_interview;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Anjali
 */


public class Delete_Middle_Node {
 public void Delete_Mid(Node head, Node del)
 {
  
     Node next = del.next;
     del.data=next.data;
     del.next=next.next;
  
 }
 
 public static void main(String args[])
 {
     
     Node n=new Node(1);
     n.appendToTail(2);
     n.appendToTail(3);
     n.appendToTail(4);
     n.appendToTail(5);
     n.appendToTail(6);
     Node j=n.next.next;
     Delete_Middle_Node y=new Delete_Middle_Node();
     y.Delete_Mid(n, j);
     while(n!=null) 
     {
         System.out.println(n.data);
         n=n.next;
     }
     
     
 }
}

