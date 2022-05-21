package Clase4;

public class Conexion {

	public void conectar(String nombreServer) throws ServerTimeOutException {

		boolean successful;

		int portToConnect = 80;

		successful = open(nombreServer, portToConnect);

		if (!successful) {
			throw new ServerTimeOutException("Could not connect", portToConnect);
		}
	}

	public boolean open(String serverName, int portToConnect) {
		System.out.println("Estoy abriendo el server: " + serverName);
		return false;
	}

}
