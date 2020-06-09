package Observer;

public class Main {
	public static void main(String[] args) {
		Boss boss=new Boss();
		StockObserver tongshi1=new StockObserver("张三", boss);
		StockObserver tongshi2=new StockObserver("李四", boss);
		boss.Attach(tongshi1);
		boss.Attach(tongshi2);
		//张三没被老板通知到
		boss.Detach(tongshi1);
		//boss.SubjectState="我回来啦";
		//发出通知
		boss.Notify();
	}
}
