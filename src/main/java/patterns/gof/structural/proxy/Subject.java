package patterns.gof.structural.proxy;

abstract class Subject {

	public ProxyTest myClient;

	abstract public void request();
}