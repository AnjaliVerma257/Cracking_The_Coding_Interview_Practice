/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Write code to remove duplicates from an unsorted linked list.
// FOLLOW UP: How would you sovle this if a temporary buffer is not allowed
package cracking_the_coding_interview;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Anjali
 */
class Node
{
Node next=null;
int data;
public Node(int d)
{
    data = d;
}

void appendToTail(int d)
{
    Node end = new Node(d);
    Node n=this;
    while(n.next!=null)
    {
        n=n.next;
    }
    n.next = end;
    
}

Node deleteNode(Node head, int d)
{
  Node n=head;
  
  if(n.data==d)
  {
      return head.next;
  }
  
  while(n.next!=null)
  {
      if(n.next.data==d)
      {
          n.next=n.next.next;
          return head;
      }
   n = n.next;
  }
  return head;
  }
}


public class Remove_Dups {
 public Node Remove_Without(Node head)
 {
     Node mhead=head;
     Node pointer1=head;
     Node pointer2=null;
     Node prev=null;
    
     while(pointer1.next!=null)
     {
          System.out.println("Stuck in While");
         pointer2=pointer1.next;
         
         while(pointer2.next!=null)
         {
             if(pointer1.data==pointer2.data)
             {
                 prev.next=pointer2.next;
             }
             prev=pointer2;
             pointer2=pointer2.next;
         }
         pointer1=pointer1.next;
     }
     return mhead;
 }
 public Node Remove_With(Node head)
 {
     Node mhead=head;
     Map m1=new HashMap();
     Node pointer = head;
     Node prev=null;
        
        while(pointer.next!=null)
        {
            if (m1.containsKey(pointer.data))
            {
                prev.next=pointer.next;
            }
            else
            m1.put(pointer.data, 1);
            prev=pointer;
            pointer=pointer.next;
        }
        
     return mhead;
     
 }
 public static void main(String args[])
 {
     
     Node n=new Node(4);
     n.appendToTail(8);
     n.appendToTail(6);
     n.appendToTail(4);
     n.appendToTail(4);
     
     
     
     Remove_Dups k=new Remove_Dups();
     Node ans1 = k.Remove_With(n);
     Node ans2 = k.Remove_Without(n);
     while(n!=null)
     {
         System.out.println(n.data);
         n=n.next;
     }
     
     System.out.println("END OF INPUT");
     while(ans1.next!=null)
     {
         System.out.println(ans1.data);
         ans1=ans1.next;
     }
     System.out.println("END OF OUTPUT 1");
     while(ans2.next!=null)
     {
         System.out.println(ans2.data);
         ans2=ans2.next;
     }
     System.out.println("END OF OUTPUT 2");
 }
}
