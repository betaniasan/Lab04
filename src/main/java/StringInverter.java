public class StringInverter implements StringTransformer{
    @Override
    public void execute(StringDrink drink) {
        String text = drink.getText();
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();
        drink.setText(sb.toString());
    }


    public void undo(StringDrink drink) {
        execute(drink);
    }

}
