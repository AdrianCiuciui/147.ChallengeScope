package com.company;

public class X {

    int x;

    public X(int x) {
        this.x = x;
    }

    private void x () {
        int x = 0;
        while (x < 12) {
            System.out.println("1 times " + this.x + " equals " + (x+1) * this.x);
            x++;
        }
    }

    public void print () {
        x();
        System.out.println("input is " + this.x);
    }
}
