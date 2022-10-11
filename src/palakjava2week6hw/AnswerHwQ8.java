package palakjava2week6hw;
//8.	Write a program to calculate the area of a triangle.

//input a b c
//1. find semiperimeter
//2. area of triangle

import java.util.Scanner;

public class AnswerHwQ8 {
    public static void main(String[] args) {
        int a, b, c, sp;
        double area;
        System.out.println("Enter Value for the sides of a Triangle ");
        Scanner A = new Scanner(System.in);
        a = A.nextInt();
        b = A.nextInt();
        c = A.nextInt();

        sp = (a + b + c) / 2;

        area = Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c));
        System.out.println("Area of Triangle" + area);
        A.close();


    }
}
