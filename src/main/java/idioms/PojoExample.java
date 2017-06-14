
package idioms;

/**
 * PojoExample Class.
 */
public final class PojoExample implements Cloneable {

	private String stringValue;
	private long longValue;

	/**
	 * Instantiates a new pojo example.
	 *
	 * string value
	 * long value
	 *
	 * @param stringValue the string value
	 * @param longValue the long value
	 */
	public PojoExample(String stringValue, long longValue) {
		super();
		setStringValue(stringValue);
		setLongValue(longValue);
	}

	/**
	 * string value.
	 *
	 * string value
	 * pojo example
	 *
	 * @param stringValue the string value
	 * @return the pojo example
	 */
	public PojoExample setStringValue(String stringValue) {
		this.stringValue = stringValue;
		return this;
	}

	/**
	 * long value.
	 *
	 * long value
	 * pojo example
	 *
	 * @param longValue the long value
	 * @return the pojo example
	 */
	public PojoExample setLongValue(long longValue) {
		this.longValue = longValue;
		return this;
	}

	/**
	 * string value.
	 *
	 * string value
	 *
	 * @return the string value
	 */
	public String getStringValue() {
		return stringValue;
	}

	/**
	 * long value.
	 *
	 * long value
	 *
	 * @return the long value
	 */
	public long getLongValue() {
		return longValue;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (longValue ^ longValue >>> 32);
		result = prime * result + (stringValue == null ? 0 : stringValue.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		final PojoExample pojo = (PojoExample) obj;
		if (pojo.isLongValueEqualTo(longValue)) {
			if (stringValue == null) {
				if (pojo.isStringValueEqualTo(stringValue)) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * Checks if is string value equal to.
	 *
	 * string value
	 *
	 * @param stringValue the string value
	 * @return true, if is
	 * 			string value equal to
	 */
	private boolean isStringValueEqualTo(String stringValue) {
		return this.stringValue.equals(stringValue);
	}

	/**
	 * Checks if is long value equal to.
	 *
	 * long value
	 *
	 * @param longValue the long value
	 * @return true, if is
	 * 			long value equal to
	 */
	private boolean isLongValueEqualTo(long longValue) {
		return this.longValue == longValue;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#clone()
	 */
	@Override
	public PojoExample clone() {
		return new PojoExample(getStringValue(), getLongValue());
	}

}
