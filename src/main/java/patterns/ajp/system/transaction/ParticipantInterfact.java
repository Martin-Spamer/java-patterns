package patterns.ajp.system.transaction;

public interface ParticipantInterfact {

	public void join();

	public void commit();

	public void cancel();
}