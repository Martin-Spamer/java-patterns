package patterns.composite;

class Leaf extends Component {

	@Override
	public ComponentInterface operation() {
		return this;
	}

}
