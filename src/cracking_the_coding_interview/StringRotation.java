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
public class StringRotation {
    public Boolean StringRot(String orignal, String rotation)
    {
        if(orignal.length()!=rotation.length() || orignal.length()==0 || rotation.length()==0)
        {
            return false;
        }
        else
        {
            rotation=rotation+rotation;
            if (rotation.contains(orignal))
                return true;
        }
        return false;
     }
    
    public static void main(String args[])
    {
        StringRotation sr=new StringRotation();
        System.out.println(sr.StringRot("waterbottle","erbottlewate"));
    }
}
