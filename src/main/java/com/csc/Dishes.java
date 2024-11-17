package com.csc;

import java.util.Arrays;

public class Dishes {
    Dish[] stack = new Dish[5];
    int index = 0;

    public void push(Dish dish, Dish[] stack) {
        Dish custom = dish;
        if (stack[0] == null)
            stack[0] = custom;
        else if (index == stack.length - 1)
            System.out.print("The Stack is full, remove a plate first");
        else {
            stack[this.index + 1] = custom;
            this.index += 1;
        }

    }

    public Dish peek(Dish[] stack) {
        return stack[this.index];
    }

    public void pop(Dish[] stack) {
        stack[this.index] = null;
        this.index -= 1;
    }

    public int stacksize() {
        return this.index;
    }

    public void clearstack(Dish[] stack) {
        for (Dish clean : stack) {
            stack[this.index] = null;
            this.index -= 1;
            if (this.index < 0)
                break;
        }
    }

    public static void main(String[] args) {
        Dishes cabinet = new Dishes();
        Dish red = new Dish("red plate");
        Dish orange = new Dish("orange plate");
        Dish yellow = new Dish("yellow plate");
        Dish green = new Dish("green plate");
        cabinet.push(red, cabinet.stack);
        cabinet.push(orange, cabinet.stack);
        cabinet.push(yellow, cabinet.stack);
        cabinet.push(green, cabinet.stack);
        System.out.print(Arrays.toString(cabinet.stack));
        cabinet.pop(cabinet.stack);
        cabinet.pop(cabinet.stack);
        System.out.print(Arrays.toString(cabinet.stack));
        System.out.println(cabinet.stacksize());
        cabinet.clearstack(cabinet.stack);
        System.out.print(Arrays.toString(cabinet.stack));
    }
}
