public class StringReplacer implements StringTransformer{
    private char oldChar;
    private char newChar;

    public StringReplacer(char oldChar, char newChar){
        this.oldChar = oldChar;
        this.newChar = newChar;
    }
    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText();
        text = text.replace(oldChar, newChar);
        drink.setText(text);
    }
    @Override
    public void undo(StringDrink drink) {
        String text = drink.getText();
        text = text.replace(newChar, oldChar);
        drink.setText(text);
    }
    public char getOldChar() {
        return oldChar;
    }

    public void setOldChar(char oldChar) {
        this.oldChar = oldChar;
    }

    public char getNewChar() {
        return newChar;
    }

    public void setNewChar(char newChar) {
        this.newChar = newChar;
    }
}
