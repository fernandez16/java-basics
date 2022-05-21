package Clase4;

public class ServerTimeOutException extends Exception {

	private int port;

	public ServerTimeOutException(String message, int port) {
		super(message);
		this.port = port;
	}

	public int getPort() {
		return port;
	}

}
