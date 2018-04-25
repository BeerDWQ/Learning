package cn.hl.dao;

public class UserDao {
	private String name;
	private String password;
	private CardDao card;
	private ComboDao combo;
	private double balance;
	public UserDao(String name, String password, CardDao card, ComboDao combo, double balance) {
		super();
		this.name = name;
		this.password = password;
		this.card = card;
		this.combo = combo;
		this.balance = balance;
	}
	public CardDao getCard() {
		return card;
	}
	public void setCard(CardDao card) {
		this.card = card;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ComboDao getCombo() {
		return combo;
	}
	public void setCombo(ComboDao combo) {
		this.combo = combo;
	}
	
}
