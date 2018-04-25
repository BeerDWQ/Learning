package cn.hl.StrategyPattern;

public class FlyNoWay implements FlyBehavior{
	public void fly() {
		System.out.println("不会飞");
	}
}
