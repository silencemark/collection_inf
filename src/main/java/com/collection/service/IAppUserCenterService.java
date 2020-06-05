package com.collection.service;

import java.util.List;
import java.util.Map;
/**
 * 个人中心相关
 * @author silence
 *
 */
public interface IAppUserCenterService {
	/**
	 * 进入个人中心
	 * @param data
	 * @return
	 * @author silence
	 */
	Map<String, Object> getMyCenter(Map<String, Object> data);
	
	/**
	 * 签到
	 * @param data
	 * @return
	 * @author silence
	 */
	void signIn(Map<String, Object> data);
	
	/**
	 * 获取的会员体系成长值
	 * @param data
	 * @return
	 */
	Map<String, Object> myGrowthValue(Map<String, Object> data);
	
	/**
	 * 进行认证
	 * @param data
	 */
	void certification(Map<String, Object> data);
	
	/**
	 * 获取实名认证进度
	 * @param data
	 * @return
	 */
	Map<String, Object> getCertification(Map<String, Object> data);
	
	/**
	 * 我的团队
	 * @param data
	 * @return
	 */
	Map<String, Object> myTeam(Map<String, Object> data);
	
	/**
	 * 我的资产
	 * @param data
	 * @return
	 */
	Map<String, Object> myAssets(Map<String, Object> data);
	
	/**
	 * 兑换记录
	 * @param data
	 * @return
	 */
	List<Map<String, Object>> getExchangeList(Map<String, Object> data);
	
	/**
	 * 点击兑换
	 * @param data
	 */
	void exchangeVipCard(Map<String, Object> data);
	
	/**
	 * 获取我的邀请码 和 qr邀请二维码
	 * @param data
	 * @return
	 */
	Map<String, Object> myInviteCode(Map<String, Object> data);
	
	/**
	 * 更新二维码地址入库
	 * @param data
	 */
	void updateQrcode(Map<String, Object> data);
	
	/**
	 * 获取个人资料信息
	 * @param data
	 * @return
	 */
	Map<String, Object> getMyUserInfo(Map<String, Object> data);
}
