package palakjava2week6hw;

import java.sql.SQLOutput;
import java.util.Scanner;

// Q6. Write a program to enter any radius value of the circle and find out the area.(Formula of Area A=PI*r*r).
public class AnswerHwQ6 {
    public static void main(String[] args) {
        double radius, area;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
        radius = input.nextDouble();
        input.close();
        area = Math.PI * radius * radius;

        System.out.println("Area of the circle is " + area);

    }
}
