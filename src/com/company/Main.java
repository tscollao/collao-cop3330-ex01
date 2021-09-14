/*
 * UCF COP 3330 FALL 2021 Assignment 1 Solution
 * Copyright 2021 Tristan Collao
 */
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String Name = " ";
        System.out.println("What is your name?");
        Scanner input = new Scanner(System.in);

        Name = input.next();
        System.out.println("Hello, " + Name +", Nice to meet you!");
    }
}
