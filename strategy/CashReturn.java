package strategy;
/*
 * 满减
 */
public class CashReturn extends CashSuper{

	@Override
	public double acceptMoney(double money, double num) {
		if( money*num>300){
			return money*num-100;
		}else{
			return money*num;
		}
	}

}
