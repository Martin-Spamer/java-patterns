package patterns.ajp.behavioral.mediator;

import java.util.Vector;

class Mediator implements MediatorInterface {

	private Vector<ClientInterface> clients;

	public void broadcastEvent() {
		for (final ClientInterface client : this.clients) {
			client.broadcastEvent();
		}
	}

	public boolean add(ClientInterface e) {
		return this.clients.add(e);
	}

}
