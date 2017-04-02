package delegation;

class Manager implements ProcessInterface {
	Worker worker;

	public Manager() {
		super();
		worker = new Worker();
	}

	public Worker getWorker() {
		return worker;
	}

	public void setWorker(Worker worker) {
		this.worker = worker;
	}

	public void doProcess() {
		worker.doProcess();
	}
}
