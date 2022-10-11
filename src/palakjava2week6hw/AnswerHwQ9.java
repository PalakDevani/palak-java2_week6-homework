package palakjava2week6hw;
// 9.	Write a program to convert the upper case to lower case.
// input a to z----> Uppercase
// Input A to Z ----> Lowercase

import java.util.Scanner;

public class AnswerHwQ9 {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter any character ");
        Scanner A = new Scanner(System.in);
        ch = A.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            char ch2 = Character.toLowerCase(ch);
            System.out.print("Lowercase " + ch2);
            A.close();

        }
    }
}
