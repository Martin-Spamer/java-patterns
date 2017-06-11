package idioms;

public final class PojoExample {

	private String stringValue;
	private long longValue;

	public PojoExample(String stringValue, long longValue) {
		super();
		setStringValue(stringValue);
		setLongValue(longValue);
	}

	public PojoExample setStringValue(String stringValue) {
		this.stringValue = stringValue;
		return this;
	}

	public PojoExample setLongValue(long longValue) {
		this.longValue = longValue;
		return this;
	}

	public String getStringValue() {
		return this.stringValue;
	}

	public long getLongValue() {
		return this.longValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (this.longValue ^ this.longValue >>> 32);
		result = prime * result + (this.stringValue == null ? 0 : this.stringValue.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		if (this == obj) {
			return true;
		}
		final PojoExample pojo = (PojoExample) obj;
		if (pojo.isLongValueEqualTo(this.longValue)) {
			if (this.stringValue == null) {
				if (pojo.isStringValueEqualTo(this.stringValue)) {
					return true;
				}
			}
		}
		return false;
	}

	private boolean isStringValueEqualTo(String stringValue) {
		return this.stringValue.equals(stringValue);
	}

	private boolean isLongValueEqualTo(long longValue) {
		return this.longValue == longValue;
	}

	@Override
	public PojoExample clone() {
		return new PojoExample(this.getStringValue(), this.getLongValue());
	}

}
