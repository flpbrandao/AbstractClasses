package entities;

public class Individual extends TaxPayer {

	public Double healthExpenditures;

	public Individual() {
		super();
	}
	

	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}


	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	@Override
	public double calculateTax () {
		if (this.anualIncome<=20000) {
			return this.anualIncome *0.025;
		}
		else if ((this.anualIncome >=20000) && (this.healthExpenditures > 0)) {
			return ((this.anualIncome*0.025) - (this.healthExpenditures/2));
		}
		else {
			return this.anualIncome*0.025;
		}
			
	}
	
}
