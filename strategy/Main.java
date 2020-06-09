package strategy;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("输入商品单价");
		double money=sc.nextDouble();
		System.out.print("输入商品数量");
		int num=sc.nextInt();
		System.out.print("请选择促销方式(正常收费,满300减100,打8折)");
		String type=sc.next();
		CashSuper cash=CashFactory.createCashAccept(type);
		double sum=cash.acceptMoney(money, num);
		System.out.println("需支付："+sum);
	}
}
