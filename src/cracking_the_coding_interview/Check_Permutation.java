/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracking_the_coding_interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Anjali
 */
public class Check_Permutation {

    public Boolean Test_Sort(String str1, String str2) {
         char[] string1=str1.toCharArray();
         char[] string2=str2.toCharArray();
         java.util.Arrays.sort(string1);
         java.util.Arrays.sort(string2);
    if(str1.length()!=str2.length())
        return false;
    else
    {
  
        
        return Arrays.toString(string1).equals(Arrays.toString(string2));
    }
    
        
    }
    
    public Boolean Test_Another(String s1, String s2)
    {
        Map m1 = new HashMap();
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
        
        
        
        for(int j=0;j<s2.length();j++)
        {
            if (m1.containsKey(s2.charAt(j)))
            {
                int k=(int) m1.get(s2.charAt(j));
                k=k-1;
                if(k<0)
                    return false;
                
                
                m1.replace(s2.charAt(j),k);
                
                
                                   
            }
            else
            {
            return false;
            }
        }
       
        return true;
    }
    
public static void main(String args[])    
{
    Check_Permutation a=new Check_Permutation();
    System.out.println(a.Test_Another("abaaa","aabaa"));
}
}
