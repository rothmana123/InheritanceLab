import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<QA> QAList = new ArrayList<>();

    public void add(QA qa) {
        QAList.add(qa);
    }

    public void run() {
        ScoredQuiz sq = new ScoredQuiz();
        System.out.println("Welcome to the Quiz");
//        int TotalQs = QAList.size();
//        int correct = 0;
        Scanner scanner = new Scanner(System.in);

        for (QA qa : QAList) {
            qa.displayQuestion();

            // Get the user's answer as a string
            System.out.print("Enter your answer: ");
            String userAnswer = scanner.nextLine();

            // Check the answer and track correctness
            if (qa.checkAnswer(userAnswer)) {
                System.out.println("Correct!");
                sq.correct++;
//
            } else {
                System.out.println("Incorrect.");
                sq.incorrect++;
                qa.displayAnswer();
            }
        }
        System.out.println("You got " + sq.correct + " correct and " + sq.incorrect + " wrong");
    }

    public static class ScoredQuiz{
        private int correct;
        private int incorrect;
    }

    public static void main(String args[]) {
        // create an object of superclass (QA) and use it
        //creates states Q and displays it (has no answers uploaded)
        Quiz quiz = new Quiz();
        QA qa = new QA("How many states are there?", "50");
        quiz.add(qa);
        ArrayList<String> choices = new ArrayList<String>();
        choices.add("a. Sacramento");
        choices.add("b. San Francisco");
        QA cqa = new ChoiceQA("What is the capital of California?", "a", choices);
        quiz.add(cqa);
        NumberRangeQA nqa = new NumberRangeQA("How old is David Wolber", 60, 3);
        quiz.add(nqa);
        quiz.run();
    }
}


//        qa.displayQuestion();
//        Scanner scanner = new Scanner(System.in);
//        String answer = scanner.next();
//        if (qa.checkAnswer(answer)) {
//            System.out.println("correct");
//        } else {
//            System.out.println("incorrect");
//            qa.displayAnswer();
//        }


        // creating a choices list, adding answers, creating the object, running it
//        ArrayList<String> choices = new ArrayList<String>();
//        choices.add("a. Sacramento");
//        choices.add("b. San Francisco");
//        QA cqa = new ChoiceQA("What is the capital of California?", "a", choices);
//        cqa.displayQuestion();
//        //Scanner scanner = new Scanner(System.in);
//        answer = scanner.next();
//        if (cqa.checkAnswer(answer)) {
//            System.out.println("correct");
//        } else {
//            System.out.println("incorrect");
//            cqa.displayAnswer();
//        }

    //creating a NumberRange object
//        NumberRangeQA nqa = new NumberRangeQA("How old is David Wolber", 60, 3);
//        nqa.displayQuestion();
//        String numberRangeAnswer = scanner.nextLine();
//        if (nqa.checkAnswer(numberRangeAnswer)) {
//            System.out.println("correct");
//        } else {
//            System.out.println("incorrect");
//            nqa.displayAnswer();
//        }



