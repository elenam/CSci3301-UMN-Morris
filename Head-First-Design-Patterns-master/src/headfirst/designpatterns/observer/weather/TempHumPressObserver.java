package headfirst.designpatterns.observer.weather;

@FunctionalInterface
// Observer is a functional interface since it has only one method
// to implement
public interface TempHumPressObserver {
	public void update(float temp, float humidity, float pressure);
}
