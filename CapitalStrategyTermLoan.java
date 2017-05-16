package exercicio_sem_template;

public class CapitalStrategyTermLoan extends CapitalStrategy{
	
	@Override
	public double capital(Loan loan){
		return loan.Commitment()*duration(loan)*riskFactorFor(loan);
	}
	
	@Override
	public double duration(Loan loan){
		
		
	}
	
	

}
