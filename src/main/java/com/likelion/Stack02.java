package com.likelion;

public class Stack02 {

    private Integer[] arr;
    private int top = 0;

    public Stack02() {
        this.arr = new Integer[10000];
    }

    public Stack02(int size) {
        this.arr = new Integer[10000];
    }

    public Integer[] getArr() {
        return arr;
    }

    public void push(int value) {
        // 10을 넣으면 arr[0] = 10
        this.arr[top++] = value;
    }

//    public int pop() {
//        return this.arr[--this.top];
//    }
    public int pop() {
        if (this.isEmpty()) {
            throw new RuntimeException("스택이 비었습니다.");
        }
        return this.arr[--this.top];
    }

    public boolean isEmpty() {
        boolean isEmpty = this.top == 0;
        return isEmpty;
    }
}
