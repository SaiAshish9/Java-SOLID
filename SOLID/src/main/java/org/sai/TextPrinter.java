package org.sai;

public class TextPrinter {

    private TextManipulator textManipulator;

    public TextPrinter(TextManipulator textManipulator) {
        this.textManipulator = textManipulator;
    }

    public void printText() {
        System.out.println(textManipulator.getText());
    }

    public void printCharactersOfText() {
        System.out.println(textManipulator.getText().split(" "));
    }

}
