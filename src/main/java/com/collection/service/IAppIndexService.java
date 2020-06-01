package com.collection.service;

import java.util.List;
import java.util.Map;
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
	
	
}
