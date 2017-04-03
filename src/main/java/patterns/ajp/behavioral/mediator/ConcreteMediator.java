package patterns.ajp.behavioral.mediator;

import java.util.Vector;

class Mediator implements MediatorInterface {

	private Vector<ClientInterface> clients;

	public void broadcastEvent() {
		for (final ClientInterface client : clients) {
			client.broadcastEvent();
		}
	}

	public boolean add(ClientInterface e) {
		return clients.add(e);
	}

}
