package com.collection.service;

import java.util.Map;
/**
 * app登录相关
 * @author silence
 *
 */
public interface IAppLoginService {
	/**
	 * 登录
	 * @param data
	 * @return
	 * @author silence
	 */
	Map<String, Object> login(Map<String, Object> data);
	
	/**
	 * @param data
	 * @return
	 * @author silence
	 * 检验手机号
	 */
	boolean checkPhone(Map<String, Object> data);
	
	
	/**
	 * @param data
	 * @return
	 * @author silence
	 * 新增用户
	 * @return 
	 */
	Map<String, Object> insertUserInfo(Map<String, Object> data);
	
	/**
	 * @param data
	 * @return
	 * @author silence
	 * 修改密码
	 * @return 
	 */
	void updateUserInfo(Map<String, Object> data);
	
	/**
	 * @param data
	 * @return
	 * @author silence
	 * 获取用户信息
	 * @return data
	 */
	Map<String, Object> getUserInfo(Map<String, Object> data);
}
