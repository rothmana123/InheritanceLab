import java.util.ArrayList;

public class ChoiceQA extends QA {
    //data members
    ArrayList<String> choices = new ArrayList<String>();

    //constructor
    public ChoiceQA(String question, String answer, ArrayList<String> choices) {
        super(question,answer);
        this.choices=choices;
    }

    // override QA's display question so that we include the choices
    @Override
    public void displayQuestion() {
        super.displayQuestion();
        System.out.println(this.choices);
    }

//    public boolean checkAnswer(String answer, int range) {
//        return false;
//    }
}
