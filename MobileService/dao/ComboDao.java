package cn.hl.dao;

public class ComboDao {
	private int callTime;
	private int cellular;
	private int message;
	private int money;
	public ComboDao(int phoneTime, int cellular, int message, int money) {
		super();
		this.callTime = phoneTime;
		this.cellular = cellular;
		this.message = message;
		this.money = money;
	}

	public int getPhoneTime() {
		return callTime;
	}
	public void setPhoneTime(int phoneTime) {
		this.callTime = phoneTime;
	}
	public int getCellular() {
		return cellular;
	}
	public void setCellular(int cellular) {
		this.cellular = cellular;
	}
	public int getMessage() {
		return message;
	}
	public void setMessage(int message) {
		this.message = message;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
}
