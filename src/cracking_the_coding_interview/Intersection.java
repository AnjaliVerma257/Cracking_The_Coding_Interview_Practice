/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracking_the_coding_interview;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author Anjali
 */
public class Intersection {

    public static int getLength(Node n) {
        
        int result = 0;
        while (n != null) {
            result = result + 1;
            n = n.next;
        }
        
        return result;
    }

    public Boolean check_Intersect_Hash(Node a, Node b) {
        int length1 = getLength(a);
        int length2 = getLength(b);

        Node shorter = (length1 > length2) ? b : a;
        Node longer = (length1 > length2) ? a : b;

        int differ = Math.abs(length2 - length1);

        while (differ != 0) {
            longer = longer.next;
            differ = differ - 1;
        }

        while (longer != null) {
            
            if (longer == shorter) {
                return true;
            }
            longer = longer.next;
            shorter = shorter.next;
        }
        return false;

    }

    public static void main(String args[]) {
        Node i1 = new Node(3);
        i1.appendToTail(1);
        i1.appendToTail(5);
        i1.appendToTail(9);
        

        Node inter = new Node(7);
        inter.appendToTail(2);
        inter.appendToTail(1);

        Node i2 = new Node(4);
        i2.appendToTail(6);
        
        while (i2 != null) {
            if (i2.next == null) {
                i2.next = inter;
                break;
            }
            i2 = i2.next;
        }
        
        while (i1 != null) {
            if (i1.next == null) {
                i1.next = inter;
                break;
            }
            i1 = i1.next;
        }
        
        Intersection i = new Intersection();
        System.out.println(i.check_Intersect_Hash(i1, i2));

    }
}
