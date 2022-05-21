package Clase3;

public class Secretaria extends Empleado {
	int antiguedad;

	@Override
	public String getDetails() {
		return super.getDetails() + ", " + this.antiguedad;
	}
}
