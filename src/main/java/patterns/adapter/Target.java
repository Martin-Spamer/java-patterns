package patterns.adapter;

public class Target implements TargetInterface {

	public Result request() {
		return new Result();
	}

}
