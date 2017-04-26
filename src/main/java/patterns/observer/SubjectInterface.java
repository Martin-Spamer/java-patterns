package patterns.observer;

public interface SubjectInterface {

	void attachObserver(AbstractObserver observer);

	void detachObserver(ObserverInterface observer);

	void updateObservers();

}