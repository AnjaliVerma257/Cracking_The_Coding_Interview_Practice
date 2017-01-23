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
class Result
{
    public Node list;
    public boolean result;
    public Result(Node list, boolean result)
    {
      this.list = list;
      this.result = result;
    }
}
public class Palindrome {
   public Boolean check_palindrome(Node head) 
   {
      if(head == null)
        return true;
 
    Node p = head;
    Node prev = new Node(head.data);
 
    while(p.next != null){
        Node temp = new Node(p.next.data);
        temp.next = prev;
        prev = temp;
        p = p.next;
    }

          Node p1 = head;
    Node p2 = prev;
 
    while(p1!=null){
        if(p1.data != p2.data)
            return false;
 
        p1 = p1.next;
        p2 = p2.next;
    }
 
    return true;
   }
   
   
   public Boolean check_palindrome_stack(Node head) 
   {
       Stack<Integer> sd= new Stack<Integer>();
       Node ptr=head;
       while(ptr!=null)
       {
           sd.push(ptr.data);
           ptr = ptr.next;
       }
       ptr = head;
       while(ptr!=null)
       {
           if(ptr.data!=sd.pop())
               return false;
           ptr = ptr.next;
       }
       return true;
   }
   
   public Result Recursion_Method(Node head,int length)
   {
       if (head == null || length <=0)
       {
           return new Result(head, true);
       }
       else if(length == 1)
           return new Result(head.next, true);
       
       Result k = Recursion_Method(head.next, length-2);
       
       if(k.result == false || k.list == null)
       {
           return k;
       }
       
       k.result = (head.data == k.list.data);
       
       k.list = k.list.next;
       
       return k;
       
   
   }
   
   
   
   
   public static void main(String args[])
   {
       Palindrome p = new Palindrome();
       Node k=new Node(1);
       k.appendToTail(2);
       k.appendToTail(2);
       k.appendToTail(1);
       Result s = p.Recursion_Method(k, 4);
       while(k!=null)
       {
           System.out.println(k.data);
           k = k.next;
       }
       System.out.println(s.result);
   }
}
