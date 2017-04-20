package patterns.composite;

public class Leaf extends Component {

	@Override
	public ComponentInterface operation() {
		return this;
	}

}
