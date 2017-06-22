package com.DataStructures;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a[] = new int[20];
        System.out.println("Enter Size");
        int size = new Scanner(System.in).nextInt();
        Random rand = new Random();

        for(int i=0;i<size;i++){
            a[i] = rand.nextInt(1000);
        }

        System.out.println("Enter your choice 0.Choose Again 1.Display 2.Push 3.Pop 4.Exit");
        int x = new Scanner(System.in).nextInt();
        MyStack myStack = new MyStack(a,size-1,size-1);

        switch(x){
            case 1:System.out.println("Displaying");break;
            case 2:
                System.out.println("Pushing");
                break;
            case 3:
                System.out.println("Popping");break;
        }
        while(true) {
            switch (x) {
                case 0:
                    System.out.println("Enter Choice Again");
                    x = new Scanner(System.in).nextInt();
                    break;
                case 1:
                    myStack.display();
                    break;
                case 2:
                    System.out.println("Enter a value to push");
                    myStack.push(new Scanner(System.in).nextInt());
                    break;
                case 3:
                    System.out.println("Enter a value to pop");
                    myStack.pop();
                    break;
                case 4:
                    System.exit(1);
            }
        }


    }
}
