# Java Coaching
| [Java Coaching](src/main/java/coaching "Coaching Java Idioms") | [Java Patterns](src/main/java/patterns "Design Patterns in Java") |

## Java Coaching

### Java logging examples

#### Logging with an Abstract class.

	protected final Logger log = LoggerFactory.getLogger(this.getClass().getSimpleName());
	
#### Static logging 

	private static final Logger LOG = LoggerFactory.getLogger(StaticLogging.class);
