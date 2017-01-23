package cracking_the_coding_interview;


import cracking_the_coding_interview.Stack;

public class Sort_Stack
{
    static int x=0;
    public Stack sort(Stack input)
    {
  Stack output = new Stack();
  int Temp;
  
 while(!input.isEmpty())
 {
     Temp = (int)input.pop();
     
     while(output.isEmpty() == false)
     {      
         
         if((int)output.peek() > Temp)
         input.push(output.pop());
         else
             break;
     }
     
     output.push(Temp);
 }
  return output;       
    }
    public static void main(String args[])
    {
        Stack input = new Stack();
        input.push(9);
        input.push(8);
        input.push(7);
        input.push(6);
        input.push(5);
        input.push(914);
        
        
        Sort_Stack ss= new Sort_Stack();
        Stack k =ss.sort(input);
        while(!k.isEmpty())
        {
            System.out.println(k.pop());
        }
        
        
    }
}