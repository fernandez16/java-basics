package Clase3;

public class Gerente extends Empleado {
	
	protected String department;
	
	@Override
	public String getDetails() {
		return super.getDetails() + ", " + this.department;
	}
	
}
