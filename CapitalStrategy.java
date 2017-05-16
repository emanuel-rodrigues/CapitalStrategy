package exercicio_sem_template;

public abstract class CapitalStrategy {
	
	public double capital(Loan loan){
		return 0;
	}
	
	public double duration(Loan loan){
		return 0;
	}
	
	protected double riskFactorFor(Loan loan){
		return 2*4*0.3;
	}

}
