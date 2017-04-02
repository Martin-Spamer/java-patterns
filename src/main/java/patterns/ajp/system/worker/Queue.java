package patterns.ajp.system.worker;

public interface Queue {

	public void put(Object object);

	public void take();
}