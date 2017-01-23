/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// Write a code to partition a linked list around a value 'x' , such that all nodes less than 'x' come before all nodes greater than or equal to 'x'. The partition element 'x' can appear anywhere in the "right partition";
// it does not need to appear between the left and right partitions.

package cracking_the_coding_interview;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Anjali
 */


public class Partition {
 public Node Partition_Sperate_Method(Node head, int value)
 {
     Node node=head;
     Node small=null;
     Node large = null;
     
     while(node!=null)
     {
         if(node.data<value)
         {
             if(small==null)
             {
                 small=new Node(node.data);
                 
             }
             else
             {
                 small.appendToTail(node.data);
                 
             }
         }
         else
         {
             if(large==null)
                 large=new Node(node.data);
             else
                 large.appendToTail(node.data);
         }
         node=node.next;
         
     }
     Node tracker=small;
     Node temp=null;
         while(tracker!=null)
         {if(tracker.next==null)
                 temp=tracker;
         tracker=tracker.next;
                 }
         temp.next=large;
         
         
     return small;
 }
 public Node Partition_Head_Tail(Node node, int value)
 {
     Node head=node;
     Node tail=node;
     
     while(node!=null)
     {
         Node next=node.next;
         if(node.data<value)
         {
          node.next=head;
          head=node;
         }
         else
         {
             tail.next=node;
             tail=node;     
         }
         node=next;
         
     }
     tail.next=null;
     return head;
 }
 
 public static void main(String args[])
 {
     
     Node n=new Node(1);
     n.appendToTail(5);
     n.appendToTail(2);
     n.appendToTail(4);
     n.appendToTail(3);
     int value =3;
     Partition p=new Partition();
     Node k=p.Partition_Head_Tail(n, value);     
     while(k!=null)
     {
         System.out.println("Value Returned");
         System.out.println(k.data);
         k=k.next;
     }
     
     
     
 }
}

