/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracking_the_coding_interview;

import java.util.EmptyStackException;

/**
 *
 * @author Anjali
 */
public class Stack<T> {
    private static class StackNode<T>{
        private T data;
        private StackNode<T> next;
        
        public StackNode(T data)    {
            this.data = data;
        }
    }
    
    private StackNode<T> top;
    int size = 0;
    public int getSize()
    {
        return size;
    }
    public T pop()
    {
        if(top==null) throw new EmptyStackException();
        T item=top.data;
        top=top.next;
        size = size - 1;
        return item;
    }
     
    public void push(T item)    {
        StackNode<T> t = new StackNode<T>(item);
        t.next=top;
        size = size + 1;
        top = t;
    }
    
    
    public T peek()    {
        
       if (top == null) throw new EmptyStackException();
       return top.data;
    }
    
    
    public Boolean isEmpty()
    {
              return top == null;
    }
}
