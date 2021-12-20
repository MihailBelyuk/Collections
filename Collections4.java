package com.tasks.collections;

import java.util.Stack;

public class Collections4 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Vasia");
        stack.push("Dima");
        stack.push("Kolya");
        stack.push("Dasha");
        stack.push("Olya");

        while (!stack.isEmpty())
            System.out.println(stack.pop());
    }
}
