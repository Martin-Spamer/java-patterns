package javamentor.rules;

/**
 * The UndoCommand Interface.
 */
public interface UndoCommand extends CommandInterface {

	/**
	 * Redo.
	 */
	public void redo();

	/**
	 * Undo.
	 */
	public void undo();
}