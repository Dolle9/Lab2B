package com.example.lab2b;

public class Counter {
    int counter;

    public Counter() {
        counter = 5;
    }

    public void reset() {
        counter = 0;
    }

    public void decrementValue() {
        if (counter > 0) {
            counter--;
        }
    }
    public void incrementValue (){
        counter ++;
    }

    public void incrementValueLong (){
        counter += 10;
    }

    public void decrementValueLong (){
        counter -= 10;
    }
}
