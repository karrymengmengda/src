package strategy;

public class CashNormal extends CashSuper {

	@Override
	public double acceptMoney(double money, double num) {
		return money*num;
	}

}
