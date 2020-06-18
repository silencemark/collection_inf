package com.collection.service;

import java.util.List;
import java.util.Map;
/**
 * 
 * @author silence
 *
 */
public interface IManageBackStageService {
	/**
	 * 查询用户信息
	 * @author silence
	 * @return
	 */
	Map<String, Object> getUserInfo(Map<String, Object> data);
	
	/**
	 * 获取用户信息总数
	 * @param data
	 * @return
	 */
	int getUserListCount(Map<String, Object> data);
	
	/**
	 * 获取用户信息
	 * @param data
	 * @return
	 */
	List<Map<String, Object>> getUserList(Map<String, Object> data);
	
	/**
	 * 修改用户信息
	 * @param data
	 */
	void updateUserInfo(Map<String, Object> data);
	
	/**
	 * 获取banner信息列表
	 * @param data
	 * @return
	 */
	List<Map<String, Object>> getBannerList(Map<String, Object> data);
	
	/**
	 * 获取banner信息
	 * @param data
	 * @return
	 */
	Map<String, Object> getBannerInfo(Map<String, Object> data);
	
	/**
	 * 获取banner信息次数
	 * @param data
	 * @return
	 */
	int getBannerListCount(Map<String, Object> data);
	
	/**
	 * 新增banner
	 * @param data
	 */
	void insertBanner(Map<String, Object> data);
	
	/**
	 * 修改banner
	 * @param data
	 */
	void updateBanner(Map<String, Object> data);
	
	/**
	 * 获取订单列表
	 * @param data
	 * @return
	 */
	List<Map<String, Object>> getOrderList(Map<String, Object> data);
	
	/**
	 * 获取订单列表次数
	 * @param data
	 * @return
	 */
	int getOrderListCount(Map<String, Object> data);
	
	/**
	 * 冻结订单双方
	 * @param data
	 */
	void frozenOrder(Map<String, Object> data);
	
	/**
	 * 审核拒绝更改状态
	 * @param data
	 */
	void updateOrderStatus(Map<String, Object> data);
}