package com.collection.service;

import java.util.Map;
/**
 * 
 * @author silence
 *
 */
public interface ISystemService {
	/**
	 * 查询用户信息
	 * @author silence
	 * @return
	 */
	Map<String, Object> getUserInfo(Map<String, Object> data);
	/**
	 * 修改用户信息
	 * @author silence
	 * @return
	 */
	void updateUserInfo(Map<String, Object> data);
}
