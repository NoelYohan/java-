package com.example.demo;
import java.util.*;
public class binarysearch2D {
    public static void main(String[] args) {
        int a[][] = {
                {10, 20, 30, 40},
                {11, 22, 33, 44},
                {12, 22, 32, 42}
        };
        System.out.println("target found at index  "+(Arrays.toString(search(a,89))));
    }
        static int[] search(int[][] mat,int target)
        {
            int r=0;
            int c=mat.length-1;
            while(r<mat.length&& c>0)
            {
                if(mat[r][c]==target) {
                    return new int[]{r, c};
                }
                else if(mat[r][c]<target)
                    r++;
                else
                    c++;
            }
            return new int[]{-1,-1};


        }

}
