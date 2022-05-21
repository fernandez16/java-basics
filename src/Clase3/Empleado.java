package Clase3;

import java.util.Date;

public class Empleado {
	
	protected String name;
	protected double salary;
	protected Date birthDate;

	public String getDetails() {
		return "Name: " + name + "\n" + "Salary: " + salary;
	}
	
}
