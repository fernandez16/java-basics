package Clase3;

public class TestHerencia {
	public static void main(String[] args) {
		Empleado e = new Empleado();
		e.name = "Ale";
		e.salary = 30000;
//		e.birthDate = new Date();
		System.out.println(e.getDetails());
		
		System.out.println();

		Gerente g = new Gerente();
		g.name = "Pablo";
		g.salary = 40000;
		g.department = "HR";
		System.out.println(g.getDetails());
		
		// usamos POLIMORFISMO
		Empleado s = new Secretaria();
		
		if (s instanceof Secretaria) {
			Secretaria s1= (Secretaria) s;
			s1.antiguedad=22;
		}
		
	}
}
