package palakjava2week6hw;
// 3.1 Declare one instance and one static variable
// 3.2 Declare one instance method
// 3.3 Declare one static method
// 3.4 Call both static and instance variables into both instance and static methods inside print statement
// 3.5 Declare the main method
// 3.6 Call both instance and static method into the main method and run the programme

public class AnswerHwQ3 {
    int a = 10;
    static int A = 20;

    public static void main(String[] args) {
        System.out.println(A);
        AnswerHwQ3 answer3 = new AnswerHwQ3();
        answer3.myMethod();
    }

    public void myMethod() {
        System.out.println(a);
        System.out.println(AnswerHwQ3.A);
    }

    // static method
    public static void boy() {
        System.out.println(A);
        AnswerHwQ3 answer3 = new AnswerHwQ3();
        answer3.myMethod();
    }

}
