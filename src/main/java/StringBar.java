import java.util.ArrayList;
import java.util.List;

public class StringBar extends Bar{
    private boolean happyHour = false;
    private List<BarObserver> observers = new ArrayList<>();
    @Override
    public boolean isHappyHour() {
        return happyHour;
    }

    @Override
    public void startHappyHour() {
        happyHour = true;
        notifyObservers();
    }

    @Override
    public void endHappyHour() {
        happyHour = false;
        notifyObservers();
    }

    @Override
    public  void addObserver(BarObserver observer){
        observers.add(observer);
    }
    @Override
    public  void removeObserver(BarObserver observer){
        observers.remove(observer);
    }
    @Override
    public  void notifyObservers(){
        for(BarObserver observer : observers){
            if(isHappyHour()){
                observer.happyHourStarted(this);
            }else{
                observer.happyHourEnded(this);
            }
        }
    }
}
