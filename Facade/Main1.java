package Facade;
/*
 * 炒股
 */
public class Main1 {
	public static void main(String[] args) {
		Stock1 gu1=new Stock1();
		Stock2 gu2=new Stock2();
		Stock3 gu3=new Stock3();
		NationalDebt1 nd1=new NationalDebt1();
		gu1.buy();
		gu2.buy();
		gu3.buy();
		nd1.buy();
		gu1.sell();
		gu2.sell();
		gu3.sell();
		nd1.sell();
	}
}
