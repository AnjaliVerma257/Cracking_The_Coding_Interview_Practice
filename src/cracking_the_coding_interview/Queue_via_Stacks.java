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
public class Queue_via_Stacks {
Stack newest, oldest;
String last_op=null;


public Queue_via_Stacks()
        {
            newest = new Stack();
            oldest = new Stack();
        }
public int size()
{
    return oldest.getSize() + newest.getSize();
}

private void Shift()
{
    if(oldest.isEmpty())
    {
        while(!newest.isEmpty())
            oldest.push(newest.pop());
    }
}

public int Peek()
{
    return (int)oldest.peek();
}
public void Add(int item)
{
    newest.push(item);
}
public int remove()
{
    Shift();
    return (int)oldest.pop();
}
        public static void main(String args[])
{
    Queue_via_Stacks q=new Queue_via_Stacks();
    
    q.Add(1);
    q.Add(2);
    q.Add(3);
    
    System.out.println(q.remove());
    System.out.println(q.remove());
    q.Add(4);
    System.out.println(q.remove());
}
}
