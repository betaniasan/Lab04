public class StringCaseChanger implements  StringTransformer{


    @Override
    public void execute(StringDrink drink) {
        String text  = drink.getText();
        StringBuilder sb = new StringBuilder();

        for (char c : text.toCharArray()){
            if(Character.isLowerCase(c)){
                sb.append(Character.toUpperCase(c));
            }else {
                sb.append(Character.toLowerCase(c));
            }

        }
        drink.setText(sb.toString());
    }

    public void undo(StringDrink drink) {
        execute(drink);
    }
}
