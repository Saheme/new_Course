package edu.javaRushCourse.JavaSyntax.level15.lesson3.task334;

public class WrongAnswerException extends Exception {
    private final String answer;

    public WrongAnswerException(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return String.format("WrongAnswerException{ \"%s\" }", answer);
    }
}

