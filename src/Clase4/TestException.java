package Clase4;

public class TestException {

	public static void main(String[] args) {

		Conexion c = new Conexion();

		try {
			c.conectar("Capgemini");
		}

		catch (ServerTimeOutException e) {
			e.printStackTrace();
			System.out.println(e.getMessage() + "al puerto " + e.getPort());
		}

	}

}
