package patterns.mvc.model;

import java.util.Observable;

import patterns.mvc.ModelInterface;

public abstract class AbstractModel extends Observable implements ModelInterface {

	public AbstractModel() {
		super();
	}

}
