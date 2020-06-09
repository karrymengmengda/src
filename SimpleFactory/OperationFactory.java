package SimpleFactory;

public class OperationFactory {

	public static Operation createOperate(String operator){
		Operation oper=null;
		switch (operator) {
		case "+":
			oper=new Addition();
			break;
		case "-":
			oper=new Subtraction();
			break;
		case "*":
			oper=new Multiplication();
			break;
		case "/":
			oper=new Division();
			break;

		default:
			System.out.println("您输入的运算符不正确");
			break;
		
		}
		return oper;
	}
}
