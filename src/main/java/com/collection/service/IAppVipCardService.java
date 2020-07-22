package com.collection.service;

import java.util.List;
import java.util.Map;
/**
 * VIP会员卡相关
 * @author silence
 *
 */
public interface IAppVipCardService {
	
	/**
	 * 获取会员卡列表
	 * 当前能抢购的 优先展示
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getVipCardList(Map<String, Object> data);
	
	/**
	 * 获取待支付会员卡列表
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getWaitPayCard(Map<String, Object> data);
	
	/**
	 * 进入立即支付信息
	 * @param data
	 * @return
	 */
	Map<String, Object> getPayVipCardInfo(Map<String, Object> data);
	
	/**
	 * 上传支付凭证
	 * @param data
	 */
	Map<String, Object> payVipCard(Map<String, Object> data);
	
	/**
	 * 获取卖家/卖家信息
	 * @param data
	 * @return
	 */
	Map<String, Object> getContactPhone(Map<String, Object> data);
	
	/**
	 * 获取交易中会员卡列表
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getSaleCardList(Map<String, Object> data);
	
	/**
	 * 获取会员卡信息 审核页面
	 * @param data
	 * @return
	 * @author silence
	 */
	Map<String, Object> getExamineInfo(Map<String, Object> data);
	
	/**
	 * 审核通过
	 * @param data
	 */
	void examinePast(Map<String, Object> data);
	
	/**
	 * 获取我的会员卡列表（审核通过）
	 * @param data
	 * @return
	 */
	List<Map<String, Object>> getMyCardList(Map<String, Object> data);
	
	/**
	 * 获取我的历史会员卡列表
	 * @param data
	 * @return
	 */
	List<Map<String, Object>> getMyHisCardList(Map<String, Object> data);
	
	/**
	 * 获取会员卡信息
	 * 和VIP卡对应的视频包
	 * @param data
	 * @return
	 */
	Map<String, Object> getMemberCardInfo(Map<String, Object> data);
	
	/**
	 * 评论视频
	 * @param data
	 */
	void commentMovie(Map<String, Object> data);
	
	/**
	 * 获取会员卡信息（初始化出售页面）
	 * @param data
	 * @return
	 */
	Map<String, Object> getSellCardInfo(Map<String, Object> data);
	
	/**
	 * 提交立即出售
	 * @param data
	 */
	Map<String, Object> commitSellCard(Map<String, Object> data);
	
	/**
	 * 参与抢购
	 * @param data
	 */
	Map<String, Object> insertRushToBuy(Map<String, Object> data);
	
	/**
	 * 获取我的会员卡列表（抢购中）
	 * @param data
	 * @return
	 */
	List<Map<String, Object>> getRushToBuyList(Map<String, Object> data);
	
	/**
	 * 浏览电影热度加1  type  1 普通电影  2 会员电影
	 * @param data
	 */
	void addMovieHot(Map<String, Object> data);
}
