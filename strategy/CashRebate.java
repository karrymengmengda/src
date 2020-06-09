package strategy;
/*
 * 打折收费类
 */
public class CashRebate extends CashSuper{
	private double moneyRebate=1;
	public CashRebate(double moneyRebate){
		this.moneyRebate=moneyRebate;
	}
	public double acceptMoney(double money,double num) {
		
		return money=money*num*moneyRebate;
	}

}
