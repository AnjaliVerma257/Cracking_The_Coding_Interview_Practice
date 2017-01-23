/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracking_the_coding_interview;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author Anjali
 */
public class One_Away {
    char[] input1;
    char[] input2;
  
    
    
    public boolean Test(String i1, String i2)
    {
        this.input1=i1.toCharArray();
        this.input2=i2.toCharArray();
      
        
       Map m1 = new HashMap();
        
        for(int i=0; i<input1.length;i++)
        {
            if (m1.containsKey(input1[i]))
            {
                int k=(int) m1.get(input1[i]);
                m1.replace(input1[i],k+1);
            }
            else
            m1.put(input1[i], 1);
        }
        
        
        
        for(int i=0; i<input2.length;i++)
        {
            if (m1.containsKey(input2[i]))
            {
                int k=(int) m1.get(input2[i]);
                m1.replace(input2[i],k+1);
            }
            else
            m1.put(input2[i], 1);
        }
        
        
        int one_val=0;
        Collection a=m1.values();
        Iterator iterator = a.iterator();
       while(iterator.hasNext())
        {
            int value=(int) iterator.next();
             int temp=value%2;
            if(temp==1)
            {
                one_val=one_val+1;
                
            }
            
        }
     
       if(input1.length==input2.length && one_val==2)
           return true;
       else if( (((input1.length)-(input2.length))== 1) && one_val==1)
           return true;
       else if( (((input2.length)-(input1.length))== 1) && one_val==1)
           return true;
       else
           return false;
        
        
    }
    
    public static void main(String args[])
    {
        One_Away a=new One_Away();
        
        System.out.println(a.Test("pale","ple"));
        System.out.println(a.Test("pales","pale"));
        System.out.println(a.Test("pale","bale"));
        System.out.println(a.Test("pale","bake"));
    }
}
