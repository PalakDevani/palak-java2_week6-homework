package palakjava2week6hw;
//13.	Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
import java.util.Scanner;

public class AnswerHwQ13 {
    public static void main(String[]args){
         Scanner scanner=new Scanner(System.in);
         System.out.print("Enter first number :");
         int num1 =scanner.nextInt();
        System.out.print("Enter second number :");
        int num2 =scanner.nextInt();
        System.out.print("Enter third number :");
        int num3 =scanner.nextInt();
        System.out.println("Average of given three number is = "+"\t"+(num1+num2+num3)/3);
        scanner.close();
    }
}
