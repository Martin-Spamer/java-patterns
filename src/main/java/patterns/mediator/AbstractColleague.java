
package patterns.mediator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * AbstactColleague Class.
 */
public abstract class AbstractColleague implements ColleagueInterface {

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());

}
