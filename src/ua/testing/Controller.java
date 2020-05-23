package ua.testing;

import java.util.Scanner;

/**
 * <h1>Sentence MVC Pattern</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-03
 */
public class Controller {
    public static final String FIRST_WORD = "Hello";
    public static final String SECOND_WORD = "Java!";
    Model sentence;
    View view;

    public Controller(Model sentence, View view) {
        this.sentence = sentence;
        this.view = view;
    }

    public void processUser() {
        String word = "";
        boolean exit = false;
        while (true) {
            word = getWord((byte) 1);
            if (checkExit(word)) {
                exit = true;
                break;
            }
            if (checkWord((byte) 1)) {
                break;
            } else {
                view.showErrorMessage(this.view.WRONG_FIRST_WORD);
            }
        }
        while (!exit) {
            word = getWord((byte) 2);
            if (checkExit(word)) {
                break;
            }
            if (checkWord((byte) 2)) {
                view.showMessage(this.view.SENTENCE + sentence.getWordFirst() + this.view.SPACE +
                        sentence.getWordSecond() + this.view.DOUBLE_QUOTE);
                break;
            } else {
                view.showErrorMessage(this.view.WRONG_SECOND_WORD);
            }
        }
    }

    public String getWord(byte number) {
        String word = "";
        Scanner scanner = new Scanner(System.in);
        if (number == 1) {
            System.out.println(view.INPUT_FIRST_WORD);
            word = scanner.nextLine();
            sentence.setWordFirst(word);
        }
        if (number == 2) {
            System.out.println(view.INPUT_SECOND_WORD);
            word = scanner.nextLine();
            sentence.setWordSecond(word);
        }
        return word;
    }

    private boolean checkWord(byte number) {
        if (number == 1 && sentence.getWordFirst().equals(FIRST_WORD)) {
            return true;
        }
        if (number == 2 && sentence.getWordSecond().equals(SECOND_WORD)) {
            return true;
        }
        return false;
    }

    private boolean checkExit(String word) {
        word = word.replace(" ", "");
        word = word.toLowerCase();
        if (word.equals("exit")) {
            return true;
        }
        return false;
    }
}
