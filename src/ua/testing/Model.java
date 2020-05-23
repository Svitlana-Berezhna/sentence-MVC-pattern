package ua.testing;

/**
 * <h1>Sentence MVC Pattern</h1>
 *
 * @author Svitlana Berezhna
 * @version 1.0
 * @since 2020-02-03
 */
public class Model {
    private String wordFirst;
    private String wordSecond;

    public String getWordFirst() {
        return wordFirst;
    }

    public void setWordFirst(String wordFirst) {
        this.wordFirst = wordFirst;
    }

    public String getWordSecond() {
        return wordSecond;
    }

    public void setWordSecond(String wordSecond) {
        this.wordSecond = wordSecond;
    }
}
