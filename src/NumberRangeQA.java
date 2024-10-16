public class NumberRangeQA extends QA{
    public int intAnswer;
    public int range;

    public NumberRangeQA(String question, int intAnswer, int range){
        super(question, String.valueOf(intAnswer));
        this.intAnswer = intAnswer;
        this.range = range;
    }

    @Override
    public boolean checkAnswer (String userAnswer) {
        //return (!(userAnswer > intAnswer+range) && !(userAnswer < intAnswer-range));
        int intUserAnswer = Integer.parseInt(userAnswer);
        return Math.abs(intUserAnswer - this.intAnswer) <= range;
    }

    @Override
    public void displayQuestion() {
        super.displayQuestion();
        System.out.println("Answer should be within range of " + range);
    }
}
