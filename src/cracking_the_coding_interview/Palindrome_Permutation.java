/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracking_the_coding_interview;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Anjali
 */
public class Palindrome_Permutation {

    
    public Boolean Test_Palindrome(String s1)
    {
        Map m1 = new HashMap();
        int one_val=0;
        for(int i=0; i<s1.length();i++)
        {
            if (m1.containsKey(s1.charAt(i)))
            {
                int k=(int) m1.get(s1.charAt(i));
                m1.replace(s1.charAt(i),k+1);
            }
            else
            m1.put(s1.charAt(i), 1);
        }
        
        Collection a=m1.values();
        Iterator iterator = a.iterator();
       while(iterator.hasNext())
        {
            int value=(int) iterator.next();
            int temp=value%2;
            if(temp==1)
            {
                
                if(one_val==1)
                    return false;
                one_val=1;
            }
        }
        
        return true;
    }
    
public static void main(String args[])    
{
    Palindrome_Permutation a=new Palindrome_Permutation();
    System.out.println(a.Test_Palindrome("abbacdc"));
}
}
