package com.likelion;

public class Stack01 {
    private int[] arr = new int[10000];

    // point 0부터 시작
    private int pointer = 0;
    public Stack01() {
    }

    public Stack01(int size) {
        this.arr = new int[size];
    }

    // 순차적으로 arr에 담아준다.
    public void push(int value){
        this.arr[this.pointer] = value;
        this.pointer ++;
    }
    public int[] getArr(){
        return arr;
    }

    // 마지막 arr를 빼준다
    public int pop() {
        int value = this.arr[this.pointer-1];
        this.pointer--;
        return value;
    }
}
