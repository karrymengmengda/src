package SimpleFactory;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Operation oper;
		System.out.print("请输入第一个数：");
		double number1=sc.nextInt();
		System.out.print("请输入运算符(+-*/)：");
		String operator=sc.next();
		System.out.print("请输入第二个数：");
		double number2=sc.nextInt();
		oper=OperationFactory.createOperate(operator);	
		double result=oper.getValue(number1, number2);
		System.out.println(number1+"+"+number2+"="+result);
	}
}
