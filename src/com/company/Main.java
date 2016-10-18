package com.company;

public class Main {

    public static void main(String[] args) {
        //What is "public int lastIndexOf(String str)"?
        //First, we need to talk about IndexOf!
        String x1 = "I am the robot.";
        int y1 = x1.indexOf("robot");
        System.out.println(y1); //prints 9, because the "r" of robot is contained at index 9.
        //lastIndexOf does the same thing, only instead of starting from the left, it starts from the right.
        int y2 = x1.lastIndexOf("robot");
        System.out.println(y2); //prints 9
        //However, if we start from a specific index...
        int y3 = x1.lastIndexOf("robot", 8); //prints -1, because if you start from 8, robot is never reached.
        //Therefore, lastIndexOf receives two parameters, String and int (for our purposes).
    }
}
