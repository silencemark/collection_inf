package com.collection.service;

import java.util.Map;

/**
 * 定时抢购分配功能相关
 * @author silence
 *
 */
public interface IRushBuyClacService {
	
	/**
	 * 抢购分配逻辑处理
	 * @param data
	 */
	void rushBuyCalc(Map<String, Object> data);
}
