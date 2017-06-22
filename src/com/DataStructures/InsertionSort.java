package com.DataStructures;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Dinesh Singh on 6/22/2017.
 */
public class InsertionSort {

    public static void display(int a[]){
        System.out.println("\n");
        for(int x:a){
            System.out.print(x+ " ");
        }
    }
    public static void InsertionSort(int a[]){
        int key;
        for(int j=1;j<a.length;j++){
            key = a[j];
            int i = j-1;
            while(i>=0 && a[i]>key){
                a[i+1] = a[i];
                i = i-1;
            }
            a[i+1] = key;
        }
        display(a);
    }
    public static void SelectionSort(int a[]){
        // For Selection Sort
        int imin = 0;
        for(int i=0;i<a.length;i++){
            imin = i;
            for(int j = 0;j<a.length;j++){
                if(a[imin]<a[j]){
                    int temp = a[imin];
                    a[imin] = a[j];
                    a[j] = temp;
                }
            }
        }
        display(a);
    }

    public static void BubbleSort(int a[]){
        boolean swapped = true;
        int j=0;
        while(swapped){
            swapped = false;
            j++;
            for(int i=0;i<a.length-j;i++){
                if(a[i]>a[i+1]){
                    int temp = a[i+1];
                    a[i+1] = a[i];
                    a[i] = temp;
                    swapped = true;
                }
            }
        }
        display(a);

    }
    public static void main(String args[]){
        System.out.println("Array is");
        Random rand = new Random();
        int a[] = new int[10];
        for(int i=0;i<10;i++){
            a[i] = rand.nextInt(10);
        }
        for(int i:a){
            System.out.print(i + "  ");
        }

        System.out.println("\n\n1. Selection \n2. Insertion \n3. Bubble");
        int option = new Scanner(System.in).nextInt();
        switch (option){
            case 1: SelectionSort(a);break;
            case 2: InsertionSort(a);break;
            case 3: BubbleSort(a);break;

        }
    }
}
