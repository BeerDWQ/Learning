package cn.hl.mobileroom;

import cn.hl.log.*;
import cn.hl.signin.*;
import cn.hl.inmoney.*;
import cn.hl.countmoney.*;
import cn.hl.select.*;

public class SouSou extends MoblieRoom{
	public SouSou() {
		super();
		log = new Login1();
		signIn = new SignIn1();
		inMoney = new InMoney1();
		countMoney = new CountMoney1();
		select = new Select1();
	}
}
