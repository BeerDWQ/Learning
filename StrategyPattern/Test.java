package cn.hl.StrategyPattern;

public class Test {
	public static void main(String[] args) {
		Duck duck1=new Duck1();
		Duck duck2=new Duck2();
		//duck1.performFly();
		duck1.setFlyBehavior(new FlyNoWay());
		duck1.performFly();
		duck2.performFly();
	}
}
