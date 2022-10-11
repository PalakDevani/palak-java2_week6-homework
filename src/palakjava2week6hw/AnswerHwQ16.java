package palakjava2week6hw;

/* 16.	Write a Java program to add two binary numbers.
Input Data:
	 	 	Input first binary number: 10
	 	 	Input second binary number: 11
 Expected Output:
 	  	Sum of two binary numbers: 101 */

import java.util.Scanner;

public class AnswerHwQ16 {
    public static void main(String[] args) {
        long binary1, binary2;
        int a = 0, remainder = 0;
        int[] sum = new int[20];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input first binary number: ");
        binary1 = scanner.nextLong();
        System.out.print("Input second binary number: ");
        binary2 = scanner.nextLong();

        while (binary1 != 0 || binary2 != 0) {
            sum[a++] = (int) ((binary1 % 10 + binary2 % 10 + remainder) % 2);
            remainder = (int) ((binary1 % 10 + binary2 % 10 + remainder) / 2);
            binary1 = binary1 / 10;
            binary2 = binary2 / 10;
        }
        if (remainder != 0) {
            sum[a++] = remainder;
        }
        --a;
        System.out.print("Sum of two binary numbers: ");
        while (a >= 0) {
            System.out.print(sum[a--]);
        }
        System.out.print("\n");
        scanner.close();


    }
}
