/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cracking_the_coding_interview;

import java.util.Arrays;

/**
 *
 * @author Anjali
 */
class Pixel
{
    int p1;
    int p2;
    int p3;
    int p4;
}
public class Rotate_Matrix {
    int n=8;
    public void Rotate_Mat(int[][] matrix, int n)
    {
        for(int layer = 0 ; layer <n/2 ; ++layer)
        {
            int first = layer;
            int last = n - 1 - layer;
            for(int i = first; i<last; ++i)
            {
                int offset = i - first;
                
                int top = matrix [first][i];
                
                matrix[first][i]=matrix[last-offset][first];
                
                matrix[last-offset][first] = matrix[last][last-offset];
                
                matrix[last][last-offset] = matrix[i][last];
                
                matrix[i][last]=top;
            }
        }
        for(int i=0;i<matrix[0].length;i++)
        {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
    
    public static void main(String args[])
    {
        int a[][] = new int[3][3];
        int k=1;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                a[i][j]=k;
                k=k+1;
            }
        }
         for(int i=0;i<a[0].length;i++)
        {
            System.out.println(Arrays.toString(a[i]));
        }
        Rotate_Matrix x=new Rotate_Matrix();
        x.Rotate_Mat(a, a[0].length);
    }
}
