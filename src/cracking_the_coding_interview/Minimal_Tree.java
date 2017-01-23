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
class Bin_Tree_Node
        {
    public Bin_Tree_Node left = null;
    public Bin_Tree_Node right = null;
    public int data;
    public Bin_Tree_Node(int a)
    {
        data = a;
    }
}
public class Minimal_Tree {
    int[] input;
    static int count = 0;
    public Bin_Tree_Node create(int[] i,int start, int end)
    {
        input = i;
        
        Bin_Tree_Node root = Recur(start, end);
                return root;
    }
    
    public Bin_Tree_Node Recur(int start, int end)
    {
        
        if(start>end)
            return null;
        int mid = (int)(start+end)/2;
        Bin_Tree_Node root = new Bin_Tree_Node(input[mid]);
        if(start == end)
            return root;
        
        root.left = Recur(start,mid-1);
        root.right = Recur(mid+1,end);
                     
                return root;
        
    }
 public static void main(String args[])
 {
     Minimal_Tree x = new Minimal_Tree();
     int a[]={43,44,55,66,77,87,88,89};
     Bin_Tree_Node ans = x.create(a, 0, a.length-1);
     System.out.println(ans.left.data);
     System.out.println(ans.data);
     System.out.println(ans.right.data);
     
     
     
 }
}
