package patterns.mvc.controller;

public class AbstractCommand implements CommandInterface {

	public Result execute(Context context) {
		return new Result();
	}

}
