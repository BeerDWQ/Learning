package cn.hl.StrategyPattern;

public class Duck2 extends Duck{
	public Duck2() {
		flyBehavior=new FlyNoWay();
	}
	public void display() {
		System.out.println("Duck2");
	}
}
