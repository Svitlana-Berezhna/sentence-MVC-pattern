package ua.testing;

/**
 * <h1>Sentence MVC Pattern</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-03
 */
public class View {
    public static final String INPUT_FIRST_WORD = "Please input the first word (input \"exit\" to exit): ";
    public static final String INPUT_SECOND_WORD = "Please input the second word (input \"exit\" to exit): ";
    public static final String SENTENCE = "The sentence is: \"";
    public static final String WRONG_FIRST_WORD = "The first word is wrong. ";
    public static final String WRONG_SECOND_WORD = "The second word is wrong. ";
    public static final String SPACE = " ";
    public static final String DOUBLE_QUOTE = "\"";
    Model sentence;

    public View(Model sentence) {
        this.sentence = sentence;
    }

    public void showMessage(String msg) {
        System.out.println(msg);
    }

    public void showErrorMessage(String errorMsg) {
        System.err.println(errorMsg);
    }
}
