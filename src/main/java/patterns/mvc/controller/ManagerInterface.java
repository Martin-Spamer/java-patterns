package patterns.mvc.controller;

public interface ManagerInterface {

	void attach(Delegate delegate);

	void detach(Delegate delegate);

}