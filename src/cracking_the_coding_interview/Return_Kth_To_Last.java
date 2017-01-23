/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// Implement an alogirhm to find the kth to last element of a singly linked list
package cracking_the_coding_interview;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Anjali
 */


public class Return_Kth_To_Last {
 public Node Return_K(Node head, int index)
 {
     Node ans=null;
     Node pointer1=head;
     
    int length=0;
     while(pointer1.next!=null)
     {
     length = length+1;
     pointer1=pointer1.next;
     }
     System.out.println("Length" + length);
     int ans_index=length-index+1;
     Node p2=head;
     int i=0;
     while(i!=ans_index)
     {
         p2=p2.next;
         ans_index--;
     }
     System.out.println("Answer Index"+ans_index);
     ans=p2;
     return ans;
 }
 
 public static void main(String args[])
 {
     
     Node n=new Node(4);
     n.appendToTail(8);
     n.appendToTail(6);
     n.appendToTail(4);
     n.appendToTail(4);
     
     
     int num=3;
     Return_Kth_To_Last k=new Return_Kth_To_Last();
     Node ans1 = k.Return_K(n,num);
     
     
         System.out.println(ans1.data);
     
     
     
 }
}

