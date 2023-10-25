import java.security.KeyPair;
import java.util.ArrayList;
import java.util.List;
import java.util.AbstractMap.SimpleEntry;

public class SmartStrategy implements OrderingStrategy{
    private List<SimpleEntry<StringDrink, StringRecipe>> orders = new ArrayList<>();
    @Override
    public void wants(StringDrink drink, StringRecipe recipe, StringBar bar) {
        if(bar.isHappyHour()){
            bar.order(drink,recipe);
        } else{
            orders.add(new SimpleEntry<>(drink,recipe));
        }
    }

    @Override
    public void happyHourStarted(StringBar bar) {
        for(SimpleEntry<StringDrink,StringRecipe> order : orders){
            bar.order(order.getKey(),order.getValue());
        }
        orders.clear();
    }

    @Override
    public void happyHourEnded(StringBar bar) {
        
    }
}
