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
public class Is_Unique {

    public Boolean Test_Unique(String str) {
         if (str.length() > 26) { // NOTE: Are you sure this isn't 26?
        return false;
    }
    int checker = 0;
    for (int i = 0; i < str.length(); i++) {
        int val = str.charAt(i) - 'a';
        if ((checker & (1 << val)) > 0) return false;
        checker |= (1 << val);
    }
    return true;
        
    }
    
public static void main(String args[])    
{
    Is_Unique a=new Is_Unique();
    System.out.println(a.Test_Unique("aba"));
}
}
