/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracking_the_coding_interview;

/**
 *
 * @author Anjali
 */
public class Loop_Detection {
    public Node detect_cycle(Node head)
    {
        Node ptr1 = head;
        Node ptr2 = head;
        int k=0;
        while(ptr1.next!=null && ptr2.next!=null)
        {
                     ptr2 = ptr2.next;            
                ptr1=ptr1.next.next;    
                
                if(ptr1 == ptr2)
                {
                    break;
                }
                
                
              
        }
        
        if( ptr1 == null || ptr2 == null)
        {
            return null;
        }
        ptr2=head;
        while(ptr2!=ptr1)
        {
            ptr2 = ptr2.next;
            ptr1 = ptr1.next;
        }
        return ptr1;
    }
    
    public static void main(String args[])
    {
        Node i1 = new Node(1);
        i1.appendToTail(2);
        
        Node temp = i1;

        Node circ = new Node(7);
        circ.appendToTail(2);
        circ.appendToTail(1);
            while (i1 != null) {
            if (i1.next == null) {
                i1.next = circ;
                break;
            }
            i1 = i1.next;
        }
       
         while (circ != null) {
            if (circ.next == null) {
                circ.next = circ;
                break;
            }
            circ = circ.next;
        }
        
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
        
        Loop_Detection l=new Loop_Detection();
        
        System.out.println(((Node)l.detect_cycle(i1)).data);
    }
    
    
}
