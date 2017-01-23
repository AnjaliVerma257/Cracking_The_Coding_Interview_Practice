/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anjali
 */
class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;
    TreeNode parent;

    TreeNode(int x) {
        val = x;
    }

    public void TreeNodeSet(TreeNode left, TreeNode right, TreeNode parent) {
        
        this.left = left;
        this.right = right;
        this.parent = parent;
    }
    
    
}

public class Successor {

    public TreeNode Suco(TreeNode suco) {
        
        TreeNode parent = suco.parent;
           if(suco.right!=null)
           {
               return suco.right;
           }
                
        if (suco == parent.left) {
            return parent;
        } else if (suco == parent.right) {
            while(parent!=parent.parent.left)
            {
                parent = parent.parent;
                                  
            }
            return parent.parent;
        } else {
            System.out.println("Here");
            return null;
        }
    }

    public static void main(String args[]) {
        
        TreeNode t8 = new TreeNode(8);
        TreeNode t4 = new TreeNode(84);
        TreeNode t18 = new TreeNode(18);
        TreeNode t2 = new TreeNode(2);
        TreeNode t6 = new TreeNode(6);
        TreeNode t14 = new TreeNode(14);
        TreeNode t21 = new TreeNode(21);
        TreeNode t1 = new TreeNode(1);
        TreeNode t3 = new TreeNode(3);
        TreeNode t5 = new TreeNode(5);
        TreeNode t7 = new TreeNode(7);
        TreeNode t12 = new TreeNode(12);
        TreeNode t17 = new TreeNode(17);
        TreeNode t19 = new TreeNode(19);
        TreeNode t28 = new TreeNode(28);
         
        
        t8.TreeNodeSet(t4,t18,null);
        t4.TreeNodeSet(t2,t6,t8);
        t18.TreeNodeSet(t14,t21,t8);
        t2.TreeNodeSet(t1,t3,t4);
        t6.TreeNodeSet(t5,t7,t4);
        t14.TreeNodeSet(t12,t17,t18);
        t21.TreeNodeSet(t19,t28,t18);
        t1.TreeNodeSet(null, null, t2);
        t3.TreeNodeSet(null, null, t2);
        t5.TreeNodeSet(null, null,t6);
        t7.TreeNodeSet(null, null, t6);
        t12.TreeNodeSet(null, null, t14);
        t17.TreeNodeSet(null, null, t14);
        t19.TreeNodeSet(null, null, t21);
        t28.TreeNodeSet(null, null, t21);
        
        Successor sc = new Successor();
        System.out.println((sc.Suco(t18)).val);
    }
    
    
}
