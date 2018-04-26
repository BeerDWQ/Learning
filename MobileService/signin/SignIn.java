package cn.hl.signin;

import java.util.HashMap;
import java.util.Map;

import cn.hl.dao.UserDao;

public interface SignIn {
	public HashMap<String,UserDao> signIn();
}
