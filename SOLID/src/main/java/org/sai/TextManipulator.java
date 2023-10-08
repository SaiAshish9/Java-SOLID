package org.sai;

/**
 * Let’s consider a class that contains code that changes the text in some way.
 * The only job of this class should be manipulating text.
 */
public class TextManipulator {

    private String text;

    public TextManipulator(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void appendText(String newText) {
        text = text.concat(newText);
    }

    public String findWordAndReplace(String word, String replacementWord) {
        if (text.contains(word)) {
            text = text.replace(word, replacementWord);
        }
        return text;
    }

}
