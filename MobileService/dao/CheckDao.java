package cn.hl.dao;

public class CheckDao {
	private double callMoney;
	private double messageMoney;
	private double cellularMoney;
	private double usedMoney;
	public CheckDao(double callMoney, double messageMoney, double cellularMoney, double usedMoney) {
		super();
		this.callMoney = callMoney;
		this.messageMoney = messageMoney;
		this.cellularMoney = cellularMoney;
		this.usedMoney = usedMoney;
	}
	public double getUsedMoney() {
		return usedMoney;
	}
	public void setUsedMoney(double usedMoney) {
		this.usedMoney = usedMoney;
	}
	public CheckDao(double callMoney, double messageMoney, double cellularMoney) {
		super();
		this.callMoney = callMoney;
		this.messageMoney = messageMoney;
		this.cellularMoney = cellularMoney;
	}
	public double getCallMoney() {
		return callMoney;
	}
	public void setCallMoney(double callMoney) {
		this.callMoney = callMoney;
	}
	public double getMessageMoney() {
		return messageMoney;
	}
	public void setMessageMoney(double messageMoney) {
		this.messageMoney = messageMoney;
	}
	public double getCellularMoney() {
		return cellularMoney;
	}
	public void setCellularMoney(double cellularMoney) {
		this.cellularMoney = cellularMoney;
	}
	
}
