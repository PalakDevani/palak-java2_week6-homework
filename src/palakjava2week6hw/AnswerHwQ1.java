package palakjava2week6hw;

public class AnswerHwQ1 {
    int a = 10;
    String name = "Straberry";

    public static void main(String[] args) {
        AnswerHwQ1 answerHw1 = new AnswerHwQ1();
        System.out.println(answerHw1.a);
        System.out.println(answerHw1.name);
        answerHw1.myMethod(); // other way to write print statement
    }

    // instance method
    void myMethod() {
        System.out.println(a);
        System.out.println(name);
    }
}
