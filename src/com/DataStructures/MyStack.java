package com.DataStructures;

/**
 * Created by Dinesh Singh on 6/22/2017.
 */
public class MyStack {
    int top;
    int size;
    int a[] = new int[20];

    public MyStack(int a[], int size, int top) {
        this.a = a;
        this.top = top;
        this.size = size;
    }

    public void push(int x) {
        if (top != a.length) {
            a[top] = x;
            top++;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public void pop() {
        if (top != -1) {
            System.out.println(a[top]);
            top--;
        } else {
            System.out.println("Stack Underflow");
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }
    }
}
