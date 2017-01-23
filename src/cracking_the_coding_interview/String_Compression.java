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
public class String_Compression {
    
    public String Test_String(String input)
    {
        char[] s1=input.toCharArray();
        String output="";
        char c=s1[0];
        int count=1;
        for(int i=1;i<input.length();i++)
        {
            if(c == s1[i])
                count = count+1;
            else
            {
                
                output=output+c+String.valueOf(count);
                c=s1[i];
                count=1;
            }
            
        }
        output=output+c+String.valueOf(count);
        return output;
    }
    public static void main(String args[])
    {
     String_Compression s=new String_Compression();
     System.out.println(s.Test_String("aaaaabbbbaa"));
    }
}
