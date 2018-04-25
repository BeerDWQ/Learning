package cn.hl.mobileroom;

import java.util.HashMap;
import java.util.Map;

import cn.hl.countmoney.CountMoney;
import cn.hl.dao.CheckDao;
import cn.hl.dao.ComboDao;
import cn.hl.dao.UserDao;
import cn.hl.inmoney.InMoney;
import cn.hl.log.Login;
import cn.hl.select.Select;
import cn.hl.signin.SignIn;
import cn.hl.signin.SignIn1;

public abstract class MoblieRoom {
	private ComboDao combo;
	private HashMap<String,UserDao> counters;
	Login log;
	SignIn signIn;
	Select select;
	InMoney inMoney;
	CountMoney countMoney;
	public void login() {
		log.login();
	}
	public CheckDao select() {
		return select.select();
	}
	public void inMoney(int money) {
		inMoney.inMoney(money);
	}
	public void countMoney() {
		countMoney.countMoney();
	}
	public HashMap<String,UserDao> singIn() {
		return counters;
	}
	public ComboDao getCombo() {
		return combo;
	}
	public void setCombo(ComboDao combo) {
		this.combo = combo;
	}
	public HashMap<String, UserDao> getCounters() {
		return counters;
	}
	public void setCounters(HashMap<String, UserDao> counters) {
		this.counters = counters;
	}
	
}
