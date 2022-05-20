package ejercicios;

import java.util.Arrays;

public class Ejercicio2 {

	public static void main(String[] args) {

		Ejercicio2 test = new Ejercicio2();

		int[] gradesTestOne = {4, 5, 6};
		int[] gradesTestTwo = {6, 7, 8};

		System.out.println("gradesResult test");
		System.out.println(test.gradesResult(gradesTestOne));
		System.out.println(test.gradesResult(gradesTestTwo));

		System.out.println("oddOrEven test");
		System.out.println(test.oddOrEven(1));
		System.out.println(test.oddOrEven(2));

		System.out.println("checkCategory test");
		System.out.println(test.checkCategory("a"));
		System.out.println(test.checkCategory("b"));
		System.out.println(test.checkCategory("c"));
		System.out.println(test.checkCategory("asdfsaf"));

		System.out.println("checkVehicle test");
		System.out.println(test.checkVehicle('a'));
		System.out.println(test.checkVehicle('b'));
		System.out.println(test.checkVehicle('c'));
		System.out.println(test.checkVehicle('d'));

	}
	
	boolean gradesResult(int[] grades) {

		int gradesTotal = 0;
		int gradesCounter = 0;
		float gradesAverage;
		
		for (int i = 0; i < grades.length; i++) {
			gradesTotal = gradesTotal + grades[i];
			gradesCounter++;
		}
		
		gradesAverage = gradesTotal / gradesCounter;
		
		return gradesAverage < 7 ? false : true;
		
	}
	
	boolean oddOrEven(int number) {
		return number % 2 == 0 ? false : true;
	}

	String checkCategory(String category) {
		String result = "";
		switch (category) {
		case "a":
			result = "Hijo";
			break;
		case "b":
			result = "Padres";
			break;
		case "c":
			result = "Abuelos";
			break;
		default:
			result = "Error";
		}
		return result;
	}

	String checkVehicle(char category) {
		
		boolean wheels = false;
		boolean motor = false;
		boolean closure = false;
		boolean ac = false;
		boolean airbag = false;
		
		switch (category) {
		case 'a':
			
			wheels = true;
			motor = true;
			
			break;

		case 'b':
			
			wheels = true;
			motor = true;
			closure = true;
			ac = true;
			
			break;

		case 'c':

			wheels = true;
			motor = true;
			closure = true;
			ac = true;
			airbag = true;
			
			break;

		}
		
		boolean[] carCharacteristics = {wheels, motor, closure, ac, airbag};
		
		return Arrays.toString(carCharacteristics);
		
	}

}
