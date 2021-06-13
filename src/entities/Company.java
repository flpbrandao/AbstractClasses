package entities;

public class Company extends TaxPayer{

	public Integer employeesNumber;
	
	public Company () {
		super();
	}

	public Company(String name, Double anualIncome, Integer employeesNumber) {
		super(name, anualIncome);
		this.employeesNumber = employeesNumber;
	}

	public Integer getEmployeesNumber() {
		return employeesNumber;
	}

	public void setEmployeesNumber(Integer employeesNumber) {
		this.employeesNumber = employeesNumber;
	}
	
	@Override
	public double calculateTax () {
		if (employeesNumber >= 10) {
			return  this.anualIncome * 0.014;
		
		}
		else {
			return this.anualIncome*0.016;
		}
		
	}
	
	
}
