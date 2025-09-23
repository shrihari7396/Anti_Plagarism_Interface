package edu.pict.questionmangement.exception;

import edu.pict.questionmangement.model.Question;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private Question question;

    public QuestionNotFoundException() {
        super();
    }
    public QuestionNotFoundException(String message) {
        super(message);
    }
    public QuestionNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public QuestionNotFoundException(String message, Question question) {
        super(message);
        this.question = question;
    }
}
