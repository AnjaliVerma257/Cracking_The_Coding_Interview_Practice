/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracking_the_coding_interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author Anjali
 */
class Node3 {

    String data;
    Node3 leftchild = null;
    Node3 rightchild = null;
    Node3 next = null;
    }

    class Queue1 {

        Node3 top = null;
        Node3 last = null;

        public void Enqueue(Node3 A) {
            if (top == null) {
                top = A;
                top.next = null;
                last = top;
            } else {

                last.next = A;
                last = last.next;
            }
        }

        public Node3 Dequeue() {
            Node3 ans = null;

            if (top != null) {
                ans = top;
                top = top.next;
            }

            return ans;
        }

        public Node3 peek() {
            return top;
        }

    }
public class List_Of_Depths {

     


    Queue1 q = new Queue1();

    public ArrayList<Node3> get(Node3 root) {
        ArrayList<Node3> al = new ArrayList<Node3>();
        
        q.Enqueue(root);
        
        while(q.peek()!=null)
        {
            
            Node3 head = null;
             Node3 curr = null;
            int bool = 0;
            while(q.peek()!=null)
            {
                if(bool == 0)
                {
                    head = q.Dequeue();
                    curr = head;
                    bool =1;
                }
                else
                {
                curr.next=q.Dequeue();
                curr= curr.next;
                }
            }
            
            curr = head;
            while(curr!=null)
            {
                if(curr.leftchild!=null)
                    q.Enqueue(curr.leftchild);
                
                if(curr.rightchild!=null)
                q.Enqueue(curr.rightchild);
                
        curr = curr.next;
            }
            
            al.add(head);
        }
        return al;

    }

public static void main(String args[]) {
        Node3 A = new Node3();
        A.data = "A";
        Node3 B = new Node3();
        B.data = "B";
        Node3 C = new Node3();
        C.data = "C";        
        Node3 D = new Node3();
        D.data = "D";
        Node3 E = new Node3();
        E.data = "E";
        Node3 F = new Node3();
        F.data = "F";
        Node3 G = new Node3();
        G.data = "G";
        Node3 H = new Node3();
        H.data = "H";
        Node3 I = new Node3();
        I.data = "I";
        Node3 J = new Node3();
        J.data = "J";
        
        A.leftchild=B;
        A.rightchild=C;
        
        B.leftchild = D;
        B.rightchild = E;
        
        C.leftchild = F;
        C.rightchild= G;
        
        D.leftchild = H;
        
        E.rightchild = I;
        
        G.rightchild = J;
        
        List_Of_Depths x = new List_Of_Depths();
        ArrayList<Node3> l = x.get(A);
      
        for(int i=0;i<l.size();i++)
        {
            Node3 n = l.get(i);
            while(n!=null)
            {
                System.out.print(n.data);
                n=n.next;
            }
            System.out.println();
        }
        

    }
}
