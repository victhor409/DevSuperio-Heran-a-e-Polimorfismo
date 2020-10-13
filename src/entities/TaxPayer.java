//classe abstrata

//quando temos um metodo que seja abstrato na classe 
//a propria classe deve ser abstrata

package entities;

public abstract class TaxPayer {
	
	private String Name;
	private Double anualincome;
	
	
	public TaxPayer() {
		
	}


	public TaxPayer(String name, Double anualincome) {
		super();
		Name = name;
		this.anualincome = anualincome;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public Double getAnualincome() {
		return anualincome;
	}


	public void setAnualincome(Double anualincome) {
		this.anualincome = anualincome;
	}
	
	//metodo abstrato
	public abstract double tax();
	
	

}
