/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracking_the_coding_interview;

import java.lang.reflect.Array;

/**
 *
 * @author Anjali
 */
class Balanced_Node {

    int value;
    int height;
    Balanced_Node left = null;
    Balanced_Node right = null;

    public Balanced_Node(int value) {
        this.value = value;
    }

    public void Set(Balanced_Node lnode, Balanced_Node rnode) {
        this.left = lnode;
        this.right = rnode;
    }

}

public class Check_Balanced {

    Stack<Balanced_Node> s = new Stack<Balanced_Node>();

    public Boolean checked(Balanced_Node root) {
        s.push(root);
        createStack(root);
            while(!s.isEmpty())
            {
             Balanced_Node temp = s.pop();
             if(temp.left == null && temp.right == null)
                 temp.height = 1;
             else
             {
                 int x1=(temp.left!=null)?temp.left.height:0;
                 int x2=(temp.right!=null)?temp.right.height:0;
                 
                 temp.height = Math.max(x1,x2) + 1;
                 
                 if(Math.abs(x1-x2) >= 2)
                     return false;
             
             }
             
             
            }
        return true;
    }

    /**
     *
     * @param root
     */
    public void createStack(Balanced_Node root) {
        
        
            
            if (root.left != null) {
                s.push(root.left);
                createStack(root.left);
            }

            if (root.right != null) {
                s.push(root.right);
                createStack(root.right);
            }

            
            

        
    }

    public static void main(String args[]) {
                Balanced_Node n1 = new Balanced_Node(1);
                Balanced_Node n2 = new Balanced_Node(2);
                Balanced_Node n3 = new Balanced_Node(3);
                Balanced_Node n4 = new Balanced_Node(4);
                Balanced_Node n5 = new Balanced_Node(5);
                Balanced_Node n6 = new Balanced_Node(6);
                Balanced_Node n7 = new Balanced_Node(7);
                
                n1.left = n2;
                //n1.right = n3;
                
                n2.left = n4;
                //n2.right = n5;
                
                //n3.left = n6;
                //n3.right = n7;
                
                
                Check_Balanced cb = new Check_Balanced();
                System.out.println(cb.checked(n1));
                
                
             System.out.println(n1.height);
               System.out.println(n2.height);
               System.out.println(n4.height);
                
                
    }
}
