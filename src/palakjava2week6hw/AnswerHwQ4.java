package palakjava2week6hw;
//4.1 Declare two instance and two static variables
// 4.2 Declare one instance and one static method
//4.3 Call all four instance and static variables into both instance and static method inside the pint statement
// 4.4 Declare the main method
// 4.5 Call both instance and static methods in to the main method and run the programme

public class AnswerHwQ4 {
    int a = 10;
    String name = "Girl";
    static int A = 13;
    static String like = "Boy";

    public static void main(String[] args) {
        AnswerHwQ4 obj = new AnswerHwQ4();
        obj.myAnswer();// a=10, name="Girl"
        car();
    }

    //instance method
    public void myAnswer() {
        System.out.println(a);
        System.out.println(name);
        AnswerHwQ4 answerHwQ4 = new AnswerHwQ4();
        System.out.println(answerHwQ4.A); //A= 13
        System.out.println(answerHwQ4.like); //like="Boy"
    }

    //static method
    public static void car() {
        System.out.println(A);
        System.out.println(like);
        AnswerHwQ4 addition = new AnswerHwQ4();
        System.out.println(addition.a);
        System.out.println(addition.name);
    }
}
