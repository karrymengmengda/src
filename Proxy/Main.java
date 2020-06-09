package Proxy;

import java.io.Console;

public class Main {
	public static void main(String[] args) {
		SchoolGirl mm=new SchoolGirl();
		mm.setName("杨杨");
		Proxy daili=new Proxy(mm);
		daili.GiveChocolate();
		daili.GiveDolls();
		daili.GiveFlowers();
		
	}
}
