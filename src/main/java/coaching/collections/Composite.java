/**
 *  @title       BasicArray.java
 *  @description TODO
 *  @author      martin.spamer.
 *  @version     0.1 - first release.
 *	Created      23-Sep-2004
 *
 **/

package coaching.collections;

import org.slf4j.*;

/**
 * Using a basic Java array to implement an example UML Composite.
 * The Lifetime of parts is constraint bound by lifetime of parent.
 * @author martin.spamer
 * @version 0.1 - 11:15:47
 **/
public class Composite {

	private static final Logger LOG = LoggerFactory.getLogger(Composite.class);
	private ElementAlice elementAlice = new ElementAlice();
	private ElementBob elementBob = new ElementBob();
	private ElementCharlie elementCharlie = new ElementCharlie();
	private ElementDan elementDan = new ElementDan();

	/**
	 * Instantiates a new composite class array.
	 */
	public Composite() {
		super();
		LOG.info("Composite()");
		this.elementAlice = new ElementAlice();
		this.elementBob = new ElementBob();
		this.elementCharlie = new ElementCharlie();
		this.elementDan = new ElementDan();
	}

	public Composite(final ElementAlice elementAlice,
	        final ElementBob elementBob,
	        final ElementCharlie elementCharlie,
	        final ElementDan elementDan) {
		super();
		LOG.info("Composite({},{},{},{})", elementAlice, elementBob, elementCharlie, elementDan);
		this.elementAlice = elementAlice;
		this.elementBob = elementBob;
		this.elementCharlie = elementCharlie;
		this.elementDan = elementDan;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return String.format("Composite [elementAlice=%s, elementBob=%s, elementCharlie=%s, elementDan=%s]",
		        this.elementAlice, this.elementBob, this.elementCharlie, this.elementDan);
	}

}
