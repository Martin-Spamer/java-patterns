package patterns.gof.structural.composite;

abstract class Component implements CompositeInterface {

	CompositeInterface add(Component component) {
		throw new UnsupportedOperationException();
	}

	CompositeInterface remove(CompositeInterface component) {
		throw new UnsupportedOperationException();
	}

	CompositeInterface getChild(int index) {
		throw new UnsupportedOperationException();
	}

	public CompositeInterface operation() {
		throw new UnsupportedOperationException();
	}

}
