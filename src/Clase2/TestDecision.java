package Clase2;

public class TestDecision {

	public static void main(String[] args) {
		// llamada como metodo de clase (static)
		System.out.println(verCantAsistentes());

		// llamada al metodo NO ESTATICO
		TestDecision test = new TestDecision();
		System.out.println(test.verCantAsistentesAlt());
	}

	// visibilidad 4Ps
	// public, private, protected, package (no se escribe, es la DEFAULT)

	static int verCantAsistentes() {
		int attendees = 4;
		boolean largeVenue; // asumes false
		// if statement example
		if (attendees >= 5) {
			largeVenue = true;
		} else {
			largeVenue = false;
		}

		// same outcome with less code
		largeVenue = (attendees >= 5);
		// or
		String a = "";
		a = attendees >= 5 ? "SI" : "NO";

		return attendees;
	}

	int verCantAsistentesAlt() {
		int attendees = 4;
		boolean largeVenue;
		// if statement example
		if (attendees >= 5) {
			largeVenue = true;
		} else {
			largeVenue = false;
		}

		// same outcome with less code
		largeVenue = (attendees >= 5);
		// or
		String a = "";
		a = attendees >= 5 ? "SI" : "NO";

		return attendees;
	}

	String checkDay(int dayNumber) {
		String dayOfTheWeek = "";
		switch (dayNumber) {
		case 1:
			dayOfTheWeek = "Lunes";
			break;
		case 2:
			dayOfTheWeek = "Martes";
			break;
		case 3:
			dayOfTheWeek = "Miércoles";
			break;
		case 4:
			dayOfTheWeek = "Jueves";
			break;
		case 5:
			dayOfTheWeek = "Viernes";
			break;
		case 6:
			dayOfTheWeek = "Sábado";
			break;
		case 7:
			dayOfTheWeek = "Domingo";
			break;
		default:
			dayOfTheWeek = "Error";
		}
		return dayOfTheWeek;
	}

	void forUse() {
		for (int i = 0; i < 10; i++) {
			System.out.println("valor del contador: " + i);
		}

		for (int i = 10; i >= 0; i--) {
			System.out.println("valor del contador: " + i);
		}
	}
}
