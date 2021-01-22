package quiz.teil3;

public class Question {

    int number = 4; // number of answers per question

    private String questionText;
    private Answer[] anwsers = new Answer[number];

    public Question(Answer[] answers) {
        this.anwsers = answers;
    }

    public String getQuestionText() {
        return questionText;
    }

    public Answer[] getAnsers() {
        return anwsers;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public void setAnswers(Answer[] ansers) {
        this.anwsers = ansers;
    }
}
