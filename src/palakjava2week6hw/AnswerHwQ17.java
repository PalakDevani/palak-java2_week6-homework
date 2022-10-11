package palakjava2week6hw;

/*17.	Write a Java program to convert a decimal number to binary number.
	 	Input Data:
	 	 	    Input a Decimal Number : 5
	 	Expected Output
  	 	Binary number is: 101 */

import java.util.Scanner;

public class AnswerHwQ17 {
    public static void main(String[] args) {
        int dec_num, quot, a = 1, p;
        int bin_num[] = new int[100];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a Decimal Number :");
        dec_num = scanner.nextInt();

        quot = dec_num;
        while (quot != 0) {
            bin_num[a++] = quot % 2;
            quot = quot / 2;

        }
        System.out.print("Binary number is :");
        for (p = a - 1; p > 0; p--) {
            System.out.print(bin_num[p]);
        }
        System.out.print("\n");
        scanner.close();

    }
}
