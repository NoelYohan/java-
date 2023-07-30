package com.example.demo;
import java.util.*;
public class bubblesort {
    public static void main(String[] args)
    {
        int a[]={5,8,7,9,12,4,34};
        sort(a);

    }
    static void sort(int[] bin)
    {
        for(int i=0;i<bin.length;i++)
        {
            for (int j = 0; j <bin.length-1; j++) {
                if(bin[j]>bin[j+1])
                {
                    int temp=bin[j];
                    bin[j]=bin[j+1];
                    bin[j+1]=temp;
                }
            }
        }
        for (int i = 0; i <bin.length ; i++) {
            System.out.print(bin[i]+" ");
        }
    }
}
