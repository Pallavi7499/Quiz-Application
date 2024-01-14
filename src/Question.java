import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

class Questions {
    String question;
    String[] options;
    int correctOption;

    Questions(String question, String[] options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }
}

