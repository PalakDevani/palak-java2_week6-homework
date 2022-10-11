package palakjava2week6hw;
//Q5. Write a program for a calculator with addition, subtraction, multiplication and division methods all with parameters and use string concatenation methods.( Note: Two static and Two instance methods.)

//Arithmetic Operators: * Multiplication, /Division, % Modulo, + Addition, - Subtraction


public class AnswerHwQ5notComplete {
    int c = 11;
    int c1 = 12;
    int c2 = c + c1;

    //Static Method

    public static void main(String[] args) {
        int num = 11;
        int answer;
        answer = multiNumbers(num);
        System.out.println("The result is:" + answer);
    }

    public static int multiNumbers(int a) {
        int ans = a * 11;
        return ans;
    }


}
