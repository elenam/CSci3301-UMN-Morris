package headfirst.designpatterns.observer.weather;

public interface Subject {
	public void registerObserver(TempHumPressObserver o);
	public void removeObserver(TempHumPressObserver o);
	public void notifyObservers();
}
