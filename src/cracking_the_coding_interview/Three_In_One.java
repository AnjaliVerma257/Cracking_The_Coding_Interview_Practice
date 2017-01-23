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
public class Three_In_One {

    int[] Stack = new int[100];

    class StackInfo {

        String stackName;
        int begin_index;
        int end_index;
        int length = end_index - begin_index;
        
    }

    public void ManageStack(String name1, String name2, String name3) {
        StackInfo stack1 = new StackInfo();
        StackInfo stack2 = new StackInfo();
        StackInfo stack3 = new StackInfo();

        stack1.stackName = name1;
        stack1.begin_index = 0;
        stack1.end_index = 0;

        stack2.stackName = name1;
        stack2.begin_index = 1;
        stack2.end_index = 1;

        stack3.stackName = name1;
        stack3.begin_index = 2;
        stack3.end_index = 2;

    }
    public int Pop(StackInfo name)
    {
        return 0;
    }
    public int Push(StackInfo name)
    {
        return 0;
    }
}
