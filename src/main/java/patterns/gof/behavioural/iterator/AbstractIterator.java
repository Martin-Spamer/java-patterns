package patterns.gof.behavioural.iterator;

abstract class AbstractIterator {

	abstract public Item first();

	abstract public Item next();

	abstract public void isDone();

	abstract public void currentItem();
}