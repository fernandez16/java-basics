package ejercicios;

public class Ejercicio1 {

	public char division;
	public byte goles;
	public int asistentes;
	public float promedioGoles;

	public static void main(String[] args) {
		Ejercicio1 realMadrid = new Ejercicio1();
		
		realMadrid.division = 'a';
		realMadrid.goles = 2;
		realMadrid.asistentes = 30000;
		realMadrid.promedioGoles = 1.7f;

		System.out.println(realMadrid.division);
		System.out.println(realMadrid.goles);
		System.out.println(realMadrid.asistentes);
		System.out.println(realMadrid.promedioGoles);
	}

}
