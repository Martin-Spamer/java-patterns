
package coaching.exceptions;

import lombok.extern.slf4j.Slf4j;

/**
 * An example of a unchecked Exception class.
 *
 * Java doesn't for the handling of Unchecked Exceptions, they can be either
 * caught, propagated or ignored. In general use an unchecked exception when you
 * the parent code cannot be expected to handle the error.
 *
 * Good examples would be automated test code and unit tests want to report a
 * programming error.
 */
@SuppressWarnings("serial")


@Slf4j
public class UnCheckedException extends RuntimeException {

}
