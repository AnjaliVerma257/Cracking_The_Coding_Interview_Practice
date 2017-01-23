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
public class Zero_Matrix {
    
    public void Zeros(int matrix[][])
    {
        int rows = matrix.length;
    int cols = matrix[0].length;
    
    boolean[] rowzero = new boolean[rows];
    boolean[] colzero = new boolean[cols];
    for (int r = 0; r < rows; r++) {
        for (int c = 0; c < cols; c++) {
            if (matrix[r][c] == 0) {
                rowzero[r] = true;
                colzero[c] = true;
            }
        }
    }
    for (int r = 0; r < rows; r++) {
        if (rowzero[r]) {
            for (int c = 0; c < cols; c++) {
                matrix[r][c] = 0;
            }
        }
    }
    for (int c = 0; c < cols; c++) {
        if (colzero[c]) {
            for (int r = 0; r < rows; r++) {
                matrix[r][c] = 0;
            }
        }
    }
         for(int i=0;i<matrix[0].length;i++)
        {
            System.out.println(Arrays.toString(matrix[i]));
        } 
    }
    public static void main(String args[])
    {
        int a[][]=new int[4][4];
        a[0][0]=1;
        a[0][1]=0;
        a[0][2]=1;
        a[0][3]=1;
        
        a[0][0]=1;
        a[1][1]=1;
        a[2][2]=1;
        a[3][3]=1;
        
        a[0][0]=1;
        a[1][1]=1;
        a[2][2]=1;
        a[3][3]=1;
        
        a[0][0]=1;
        a[1][1]=1;
        a[2][2]=1;
        a[3][3]=1;
        
        Zero_Matrix x=new Zero_Matrix();
        x.Zeros(a);
          for(int i=0;i<a[0].length;i++)
        {
            System.out.println(Arrays.toString(a[i]));
        }
        
    }
}
