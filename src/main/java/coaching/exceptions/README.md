# Java Patterns
| [Automation](src/main/java/automation "Automated Testing with Java") | [Java Coaching](src/main/java/coaching "Coaching Java Idioms") | [Java Patterns](src/main/java/patterns "Design Patterns in Java") |

## Java Coaching

### Java Exceptions types & handling

- Don't ignore exceptions
- Prefer specific exceptions over general exceptions
- Corollary, don't catch Throwable.
- Define your own exceptions as necessary
- Wrap the exception to preserve the call stack
- Use predefined exceptions when possible
- Handled Exceptions as close to the source as possible
- Consider if the operation can continue 
- Use Log and (re)throw sparingly.

### Checked Exceptions

Checked exceptions are checked by the compiler and must be caught or propagated, (re)thrown by method.

#### ClassNotFoundException 
Class not found.

#### IllegalAccessException
Access to a class is denied.

#### InstantiationException	
Attempt to create an object of an abstract class or interface.

#### InterruptedException	
One thread has been interrupted by another thread.

#### NoSuchFieldException	
A requested field does not exist.

#### NoSuchMethodException	
A requested method does not exist.

### UnChecked Exceptions

Subclasses of Error and RuntimeException are known as unchecked exceptions, the compiler will not enforce handling.

The compile will not force handling of UnCheckedExceptions.
This is because there is not much you can do with these exceptions.
These are really programming errors that should be fixed, 
rather than leaving it to runtime exception handling.

#### ArithmeticException
Arithmetic error, such as divide-by-zero.
#### ArrayIndexOutOfBoundsException
Array index is out-of-bounds.
#### ArrayStoreException
Assignment to an array element of an incompatible type.
#### ClassCastException
Invalid cast.
#### IllegalArgumentException	
Illegal argument used to invoke a method.
#### IllegalMonitorStateException
Illegal monitor operation, such as waiting on an unlocked thread.
#### IllegalStateException
Environment or application is in incorrect state.
#### IllegalThreadStateException
Requested operation not compatible with the current thread state.
#### IndexOutOfBoundsException
Some type of index is out-of-bounds.
#### NegativeArraySizeException
Array created with a negative size.
#### NullPointerException
Invalid use of a null reference.
#### NumberFormatException
Invalid conversion of a string to a numeric format.
#### SecurityException
Attempt to violate security.
#### StringIndexOutOfBounds
Attempt to index outside the bounds of a string.
#### UnsupportedOperationException
An unsupported operation was encountered.
