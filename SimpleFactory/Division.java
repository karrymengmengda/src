package SimpleFactory;

public class Division extends Operation{
	public double getValue(double number1,double number2){
		double value=0;
		if(number2==0){
			System.out.println("除数不能为0");
			return value;
		}else{
			value=number1/number2;
			return value;
		}
		
	}
}
