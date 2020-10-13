package entities;

public class Individual extends TaxPayer {

	// gastos com saude
	private Double healthExpenditures;

	public Individual() {

	}

	public Individual(String name, Double anualincome, Double healthExpenditures) {
		super(name, anualincome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}
	
	
	/*Pessoa física: pessoas cuja renda foi abaixo de 20000.00 pagam 15% de imposto. 
	Pessoas com renda de 20000.00 em diante pagam 25% de imposto. 
	Se a pessoa teve gastos com saúde, 50% destes gastos são abatidos no imposto. Exemplo: 
	uma pessoa cuja renda foi 50000.00 e teve 2000.00 em gastos com saúde, o imposto fica: (50000 * 25%) - (2000 * 50%) = 11500.00*/

	@Override
	public double tax() {

		//expressao ternaria
		//double basicTax = (getAnualIncome() < 20000.0) ? getAnualIncome() * 0.15 : getAnualIncome() * 0.25;
		
		double basicTax;
		if (getAnualincome() < 20000.0) {
			basicTax = getAnualincome() * 0.15;
		}

		else {
			basicTax = getAnualincome() * 0.25;
		}
		basicTax -= getHealthExpenditures() * 0.5;
		if (basicTax < 0.0) {
			basicTax = 0.0;
		}

		return basicTax;
	}
}
