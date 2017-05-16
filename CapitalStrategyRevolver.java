package exercicio_sem_template;

public class CapitalStrategyRevolver {
	
	@Override
	public double capital(Loan loan){
		return loan.outstandingRiskAmount()*dutarion(loan) * riskFactorFor(loan) + 
				(loan.unusedRiskAmount()*duration(loan)*unusedRiskFactor(loan));
	}

}
