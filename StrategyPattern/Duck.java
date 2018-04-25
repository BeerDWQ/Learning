package cn.hl.StrategyPattern;

public abstract class Duck {
	FlyBehavior flyBehavior;
	public abstract void display();
	public void performFly() {
		flyBehavior.fly();
	}
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior=flyBehavior;
	}
}
