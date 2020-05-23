package ua.testing;

/**
 * <h1>Sentence MVC Pattern</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-03
 */
public class Main {
    public static void main(String[] args) {
        Model sentence = new Model();
        View view = new View(sentence);
        Controller controller = new Controller(sentence, view);
        controller.processUser();
    }
}
