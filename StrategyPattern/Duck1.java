package cn.hl.StrategyPattern;

public class Duck1 extends Duck{
	public Duck1() {
		flyBehavior =new FlyWithWing();
	}
	public void display() {
		System.out.println("Duck1");
	}
}
