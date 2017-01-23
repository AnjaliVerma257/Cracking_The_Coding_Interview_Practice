/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracking_the_coding_interview;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Anjali
 */
class Node2 {

    String data;
    LinkedList<Node2> neighbor = new LinkedList<Node2>();
    Node2 next = null;
    public enum state
    {visited, visiting, unvisited}
    state vis = state.unvisited;
    public Node2(String a)
    {
        data = a;
    }
    public void add(Node2 nei) {
        neighbor.add(nei);
    }
}

class Queue<T> {

    Node2 top = null;
    Node2 last = null;

    public void Enqueue(Node2 A) {
        if (top == null) {
            top = A;
            top.next = null;
            last = top;
        } else {

            last.next = A;
            last = last.next;
        }
    }

    public Node2 Dequeue() {
        Node2 ans = null;

        if (top != null) {
            ans = top;
            top = top.next;
        }

        return ans;
    }
    
    
}

public class Route_Between_Nodes {

    public boolean Route(Node2 source, Node2 dest) {
        if(source == dest)
            return true;
        boolean answer = false;
        Node2 root = source;
        Queue queue = new Queue();
        while (root != null) {

            LinkedList x = root.neighbor;
            Iterator x_it = x.iterator();
            while (x_it.hasNext()) {
                Node2 a = (Node2) x_it.next();
                if (a == dest) {
                    answer = true;
                    System.out.println(a.data);
                    break;
                }
                else
                {
                    if(a.vis == Node2.state.visited || a.vis == Node2.state.visiting)
                    {
                        
                    }
                    else
                    {
                    a.vis = Node2.state.visiting;
                    queue.Enqueue(a);
                    }
                }
            }
           
            
            root = queue.Dequeue();
            if(root==null)
                return answer;
            
            root.vis = Node2.state.visited;
            
        }
        return answer;
    }
    
    
    
    public static void main(String args[])
    {
     Node2 A=new Node2("A");
     Node2 B=new Node2("B");
     Node2 C=new Node2("C");
     Node2 D=new Node2("D");
     Node2 E=new Node2("E");
    
     
    // A's neighbors
     A.add(B);
     A.add(D);
     
    // B's neighbors 
     B.add(C);
     
     //C's neighbos
     C.add(A);
     
     
     Route_Between_Nodes rbn = new Route_Between_Nodes();
     System.out.println(rbn.Route(D, C));
    }
}