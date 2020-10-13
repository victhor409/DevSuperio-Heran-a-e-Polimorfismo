package entities;

public class Company extends TaxPayer{

	private Integer numberOfemplyees;
	
	public Company() {
		
	}

	public Company(String name, Double anualincome, Integer numberOfemplyees) {
		super(name, anualincome);
		this.numberOfemplyees = numberOfemplyees;
	}
	
	
	
	public Integer getNumberOfemplyees() {
		return numberOfemplyees;
	}

	public void setNumberOfemplyees(Integer numberOfemplyees) {
		this.numberOfemplyees = numberOfemplyees;
	}
	
	/*
	 * Pessoa jurídica: pessoas jurídicas pagam 16% de imposto. Porém, se a empresa possuir mais de 10 funcionários, ela paga 14% de imposto. 
	 * Exemplo: uma empresa cuja renda foi 400000.00 e possui 25 funcionários, o imposto fica: 400000 * 14% = 56000.00
	 */

	@Override
	public double tax() {
		if (numberOfemplyees > 10 ) {
			return getAnualincome()*0.14;
		}
		else {
			return getAnualincome() * 0.16;
		}
		
	}
}
