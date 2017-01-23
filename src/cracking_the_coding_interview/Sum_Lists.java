/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// You have two numbers represented by a linked list, were each node contains a single digit.
// THe digits are stored in reverse order. such that the 1's digit is at the head of the list.
// Write a function that adds the two numbers and returns the sum as a linked list

// Example : 7-1-6 + 5-9-2     == 2-1-9

//Follow-Up: Suppose the digits are stored in forward order
// Example: 6-1-7 + 2-9-5     == 9-1-2     

package cracking_the_coding_interview;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Anjali
 */


public class Sum_Lists {
 public Node Add_Two_Reverse_Order(Node n1, Node n2)
 {
     Node output=new Node((n1.data+n2.data)%10);
     int carry=0;
     
     int total=n1.data+n2.data;
     
     if((n1.data+n2.data)>=10)
     carry=1;
     n1=n1.next;
     n2=n2.next;
     
     while(true)
     {
         if(n1==null)
             if(n2==null)
             break;
         
         total = ((n1==null)?0 : n1.data)+((n2==null)?0 : n2.data)+carry;
         output.appendToTail(total%10);
         carry= (total>=10)?1:0;
         n1 = (n1==null) ? null : (n1.next!=null)? n1.next : null;
         n2 = (n2==null) ? null : (n2.next!=null)? n2.next : null;
     }
    if(carry!=0)
        output.appendToTail(carry);
     return output;
 }
 
 
 public Node Add_Two_Forward_Order(Node n1, Node n2)
 {
     
     //Follow-Up: Suppose the digits are stored in forward order
// Example: 6-1-7 + 2-9-5     == 9-1-2     
     int length1=0;
     int length2=0;
     Node input1=n1;
     Node input2=n2;
     
     while(input1!=null)
     {
         length1=length1+1;
         input1=input1.next;
     }
     while(input2!=null)
     {
         length2=length2+1;
         input2=input2.next;
     }
     int total=0;
     
     
    int steps=Math.abs(length2-length1);
    
    if(steps!=0)
         {
             total = ((length1>length2) ? n1.data:(length2>length1)?n2.data:0);
     n1=((length1>length2)? n1.next:n1);
             n2=((length2>length1)? n2.next:n2);        
             steps=steps-1;
             
         }
    else
    {
        total=((n1==null)?0 : n1.data)+((n2==null)?0 : n2.data);
    }
    Node Output=new Node(total);
    
    
    
     Node position=Output;
     
     
     
     
     
     
     while(n1!=null && n2!=null)
     {
         if(steps!=0)
         {
             total = ((length1>length2) ? n1.data:(length2>length1)?n2.data:0);
             n1=((length1>length2)? n1.next:n1);
             n2=((length2>length1)? n2.next:n2);
             steps=steps-1;
         }
         else   
         {
         total=n1.data+n2.data;
         n1 = (n1.next!=null)? n1.next : null;
         n2 = (n2.next!=null)? n2.next : null;
         }
         Output.appendToTail(total%10);
         
         position.data=(total>=10)?position.data+1:position.data;
         position=position.next;
         
     }
     
     
     return Output;
 }
 
 
 
 
 public static void main(String args[])
 {
     
       //Follow-Up: Suppose the digits are stored in forward order
// Example: 6-1-7 + 2-9-5     == 9-1-2  
     
     Node n=new Node(6);
     n.appendToTail(1);
     n.appendToTail(7);
     
     Node n2=new Node(9);
     //n2.appendToTail(9);
     n2.appendToTail(5);
     
     Sum_Lists sl=new Sum_Lists();
     Node k=sl.Add_Two_Forward_Order(n, n2);
       while(k!=null) 
     {
         System.out.println(k.data);
         k=k.next;
     }
     
 }
}

