package patterns.command;

import java.util.Set;

/**
 * ParametersInterface Interface.
 */
public interface ParametersInterface {

	AbstractParameters setPrameter(String key, String value);

	Set<String> stringPropertyNames();

	String valueFor(String key);

	Boolean valueFor(String key, Boolean defaultValue);

	String valueFor(String key, String defaultValue);

	Long valueFor(String key, Long defaultValue);

}
