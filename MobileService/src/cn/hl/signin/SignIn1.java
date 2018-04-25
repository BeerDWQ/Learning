package cn.hl.signin;

import java.util.HashMap;
import java.util.Map;

import cn.hl.dao.UserDao;

public class SignIn1 implements SignIn{
	String count;
//	UserDao user;
	HashMap<String,UserDao> counters=new HashMap<String,UserDao>();
	public HashMap<String,UserDao> signIn() {
		UserDao user=new UserDao();
		counters.put(count, user);
		return counters;
	}
	
}
