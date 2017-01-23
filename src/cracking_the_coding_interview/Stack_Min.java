/*
 * into change this license header, choose License Headers in Project Properties.
 * into change this template file, choose intools | intemplates
 * and open the template in the editor.
 */
package cracking_the_coding_interview;

import java.util.EmptyStackException;

/**
 *
 * @author Anjali
 */
public class Stack_Min {
    private class StackNode{
        private int data;
        private StackNode next;
        private int Substack_Min;
        
        public StackNode(int data)    {
            this.data = data;
        }
    }
    
    private StackNode top;
    
    public int pop()
    {
        if(top==null) throw new EmptyStackException();
        int item=top.data;
        top=top.next;
        return item;
    }
     
    public void push(int item)    {
        
        StackNode t = new StackNode(item);
        if(top!=null)
            t.Substack_Min = (item<top.Substack_Min)  ?   item  :   top.Substack_Min;
        else
            t.Substack_Min=item;
        t.next=top;
        top = t;
    }
    
    
    public int getMin()
    {
        return top.Substack_Min;
    }
    
    public int peek()    {
        
       if (top == null) throw new EmptyStackException();
       return top.data;
    }
    
    
    public Boolean isEmpty()
    {
        return top == null;
    }
    
    
    public static void main(String args[])
    {
        Stack_Min minStack = new Stack_Min();
minStack.push(-2);

minStack.push(0);
minStack.push(-3);
System.out.println(minStack.getMin());  

minStack.pop();
minStack.peek();     
System.out.println(minStack.getMin()); 
    }
}
