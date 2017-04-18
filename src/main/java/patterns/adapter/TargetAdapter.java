package patterns.adapter;

public class TargetAdapter extends AbstractAdapter {

	public Result request() {
		final Target target = new Target();
		final Result result = target.request();
		return result;
	}

}
