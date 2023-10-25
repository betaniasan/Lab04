public class HumanClient implements Client{
    @Override
    public void happyHourStarted(Bar bar) {
        System.out.println("Happy hour Começou!!");
    }

    @Override
    public void happyHourEnded(Bar bar) {
        System.out.println("Happy Hour Terminou");
    }

    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if(bar.isHappyHour()){
            recipe.mix(drink);
            System.out.println("Pedido Feito durante o Happy Hour");
        }else{
            System.out.println("Pedido Feito fora do Happy Hour");
        }
    }
}
