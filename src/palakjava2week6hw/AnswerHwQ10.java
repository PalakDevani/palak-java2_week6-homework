package palakjava2week6hw;
// 10.	Write a Java program that takes a number as input and prints its multiplication table up to 10.
//Test Data: Input a number: 8

import  java.util.Scanner;

public class AnswerHwQ10 {
    public static void main(String[] args) {

        int N=0;
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter number :");
        N = scan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(N+"X"+i+"="+N*1);
            scan.close();
        }
    }
}
