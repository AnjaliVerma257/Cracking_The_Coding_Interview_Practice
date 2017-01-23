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
class NodeValidate
{
   int data;
   NodeValidate leftChild = null;
   NodeValidate rightChild = null;

    public NodeValidate(int data) {
        this.data = data;
    }
   
}
public class Validate_BST {

    public Boolean Validate(NodeValidate root) {
        Boolean input = true;
        return checkRoot(root);
    }
    
     public Boolean checkRoot(NodeValidate root)
     {
         Boolean checker = true;
    
        
         if(root.leftChild!=null)
         {
         if(root.data < root.leftChild.data)
             return false;
         
         else
         checkRoot(root.leftChild);
         }
         if(root.rightChild!=null)
         {
         if (root.data > root.rightChild.data)
             return false;
         
         else
         checkRoot(root.rightChild);
         }
             
         return checker;
     }
    
    public static void main(String args[])
    {
      NodeValidate x=new NodeValidate(8);
      
      
      
      NodeValidate left = new NodeValidate(8);
      
      
      
      x.leftChild = left;
      
      
      Validate_BST vs = new Validate_BST();
      System.out.println(vs.Validate(x));
      
    }
}
