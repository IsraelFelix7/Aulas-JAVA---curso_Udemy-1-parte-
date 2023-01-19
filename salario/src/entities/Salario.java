package entities;

public class Salario {
	
	public String name;
	public double grossSalary;
	public double tax;
	public double porcentage;
	
	public double netSalary() {
		return grossSalary - tax;
	}
	public void increaseSalary(double percentage) {
		this.porcentage = ((percentage/100) * grossSalary)+netSalary();
		
		
		
	}

}
