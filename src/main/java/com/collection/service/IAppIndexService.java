package com.collection.service;

import java.util.List;
import java.util.Map;

import org.bouncycastle.jce.provider.PBE;
/**
 * app首页相关
 * @author silence
 *
 */
public interface IAppIndexService {
	
	/**
	 * 获取首页banner图
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getHomePageBanner(Map<String, Object> data);
	
	/**
	 * 获取首页广告信息
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getAdvertisement(Map<String, Object> data);
	
	/**
	 * 获取首页免费影片信息
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getHomePageMovie(Map<String, Object> data);

	/**
	 * 模糊查询首页免费影片
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getHomePageVideoDesc(Map<String, Object> data);
	
	/**
	 * 新增社区分享
	 * @param data
	 * @return
	 */
	Map<String, Object> addCommunity(Map<String, Object> data);
	
	/**
	 * 查询朋友圈社区分享（传用户uid表示查自己的）
	 * @param data
	 * @return
	 */
	Map<String, Object> getCommunityList(Map<String, Object> data);
	
	/**
	 * 查询朋友圈社区分享详情页面
	 * @param data
	 * @return
	 */
	Map<String, Object> getCommunityDetail(Map<String, Object> data);
	
	
	/**
	 * 点赞加一接口
	 * @param data
	 */
	void likeCommunity(Map<String, Object> data);
	
	/**
	 * 新增回复
	 * @param data
	 */
	void addCommunityReply(Map<String, Object> data);
	
	/**
	 * 新增评论
	 * @param data
	 */
	void addCommunityComment(Map<String, Object> data);
	
	/**
	 * 获取评论信息
	 * @param data
	 * @return
	 */
	List<Map<String, Object>> getCommunityComment(Map<String, Object> data);
	
	/**
	 * 获取系统消息最新的一条
	 * @param data
	 * @return
	 */
	Map<String, Object> getNewSystemNotice(Map<String, Object> data);
}
