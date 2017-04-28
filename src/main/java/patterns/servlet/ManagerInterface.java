package patterns.servlet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import patterns.mvc.controller.Delegate;
import patterns.mvc.controller.Result;

public interface ManagerInterface {

	void attach(Delegate delegate);

	void detach(Delegate delegate);

	void handleRequest(HttpServletRequest request, HttpServletResponse response, Result result);

}
