package strategy;

public class CashFactory {
	public static CashSuper createCashAccept(String type){
		CashSuper cashSuper=null;
		switch (type) {
		case "正常收费":
			cashSuper=new CashNormal();
			break;

		case "满300减100" :
			cashSuper=new CashReturn();
			break;
			
		case "打8折" :
			cashSuper=new CashRebate(0.8);
			break;
		}
		return cashSuper;
		
	}
}
