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
	
	/**
	 * 获取首页免费电影管理列表
	 * @param data
	 * @return
	 */
	List<Map<String, Object>> getIndexMovieList(Map<String, Object> data);
	
	/**
	 * 获取首页免费电影管理列表次数
	 * @param data
	 * @return
	 */
	int getIndexMovieListCount(Map<String, Object> data);
	
	/**
	 * 修改首页免费电影信息
	 * @param data
	 */
	void updateIndexMovie(Map<String, Object> data);
	
	/**
	 * 新增首页免费电影信息
	 * @param data
	 */
	void insertIndexMovie(Map<String, Object> data);
	
	/**
	 * 获取会员卡信息列表
	 * @return
	 */
	List<Map<String, Object>> getMemberCardList(Map<String, Object> data);
	
	/**
	 * 获取会员卡信息总数
	 * @param data
	 * @return
	 */
	int getMemberCardListCount(Map<String, Object> data);
	
	/**
	 * 修改会员卡信息
	 * @param data
	 */
	void updateMemberCard(Map<String, Object> data);
	
	
	/**
	 * 获取会员等级信息列表
	 * @return
	 */
	List<Map<String, Object>> getLevelList(Map<String, Object> data);
	
	/**
	 * 获取会员等级信息总数
	 * @param data
	 * @return
	 */
	int getLevelListCount(Map<String, Object> data);
	
	/**
	 * 修改会员等级信息
	 * @param data
	 */
	void updateLevel(Map<String, Object> data);
	
	/**
	 *  获取审核信息列表
	 * @return
	 */
	List<Map<String, Object>> getCertificationList(Map<String, Object> data);
	
	/**
	 * 获取审核信息列表总数
	 * @param data
	 * @return
	 */
	int getCertificationListCount(Map<String, Object> data);
	
	/**
	 * 审核实名认证
	 * @param data
	 */
	void updateCertification(Map<String, Object> data);
	
	/**
	 *  获取收款方式信息列表
	 * @return
	 */
	List<Map<String, Object>> getPaymentMethodList(Map<String, Object> data);
	
	/**
	 * 获取收款方式信息列表总数
	 * @param data
	 * @return
	 */
	int getPaymentMethodListCount(Map<String, Object> data);
	
	/**
	 *  获取投诉建议列表
	 * @return
	 */
	List<Map<String, Object>> getQuestionList(Map<String, Object> data);
	
	/**
	 * 获取投诉建议列表总数
	 * @param data
	 * @return
	 */
	int getQuestionListCount(Map<String, Object> data);
	
	/**
	 * 回复投诉
	 * @param data
	 */
	void replyQuestion(Map<String, Object> data);
	
	/**
	 *  获取兑换记录列表
	 * @return
	 */
	List<Map<String, Object>> getExchangeList(Map<String, Object> data);
	
	/**
	 * 获取兑换记录列表总数
	 * @param data
	 * @return
	 */
	int getExchangeListCount(Map<String, Object> data);
	
}
