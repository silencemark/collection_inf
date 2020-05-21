package com.collection.service.warehouse;

import java.util.List;
import java.util.Map;
/**
 * 仓库管理
 * @author silence
 *
 */
public interface WarehouseService {
	/**
	 * 用料列表
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getMaterialList(Map<String, Object> data);
	/**
	 * 用料数量
	 * @param data
	 * @return
	 * @author silence
	 */
	int getMaterialListNum(Map<String, Object> data);
	/**
	 * 添加用料单
	 * @param data
	 * @return
	 * @author silence
	 */
	String insertMaterial(Map<String,Object> data);
	/**
	 * 添加用料单物料明细
	 * @param data
	 * @return
	 * @author silence
	 */
	void insertUsedMaterial(Map<String,Object> data);
	/**
	 * 今日用料单数量
	 * @param data
	 * @return
	 * @author silence
	 */
	int getMaterialNumByCompany(Map<String, Object> data);
	/**
	 * 用料单详情
	 * @param data
	 * @return
	 * @author silence
	 */
	Map<String, Object> getMaterialInfo(Map<String, Object> data);
	Map<String, Object> getSendNameByForadid(Map<String, Object> map);
	/**
	 * 用料单物料列表
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getUsedMaterialList(Map<String, Object> data);
	/**
	 * 审核用料单 （修改）
	 * @param data
	 * @return
	 * @author silence
	 */
	String updateMaterialOrder(Map<String, Object> data);
	
	/*---------------------------------------退货单--------------------------------------------------*/
	
	/**
	 * 退货单列表
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getReturnOrderList(Map<String, Object> data);
	/**
	 *  退货单数量
	 * @param data
	 * @return
	 * @author silence
	 */
	int getReturnOrderListNum(Map<String, Object> data);
	/**
	 *  今日退货单数量
	 * @param data
	 * @return
	 * @author silence
	 */
	int getReturnNumByCompany(Map<String, Object> data);
	/**
	 * 添加退货单
	 * @param data
	 * @return
	 * @author silence
	 */
	String insertReturn(Map<String,Object> data);
	/**
	 * 添加退货单物料明细
	 * @param data
	 * @return
	 * @author silence
	 */
	void insertReturnMaterial(Map<String,Object> data);
	/**
	 * 退货单详情
	 * @param data
	 * @return
	 * @author silence
	 */
	Map<String, Object> getReturnInfo(Map<String, Object> data);
	/**
	 * 退货单物料列表
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getReturnMaterialList(Map<String, Object> data);
	/**
	 * 审核（修改）退货单
	 * @param data
	 * @return
	 * @author silence
	 */
	String updateReturnOrder(Map<String,Object> data);
	
	/*---------------------------------------报损单--------------------------------------------------*/
	
	/**
	 * 退货单列表
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getReportlossOrderList(Map<String, Object> data);
	/**
	 *  退货单数量
	 * @param data
	 * @return
	 * @author silence
	 */
	int getReportlossOrderListNum(Map<String, Object> data);
	/**
	 *  今日退货单数量
	 * @param data
	 * @return
	 * @author silence
	 */
	int getReportlossNumByCompany(Map<String, Object> data);
	/**
	 * 添加退货单
	 * @param data
	 * @return
	 * @author silence
	 */
	String insertReportloss(Map<String,Object> data);
	/**
	 * 添加退货单物料明细
	 * @param data
	 * @return
	 * @author silence
	 */
	void insertReportlossMaterial(Map<String,Object> data);
	/**
	 * 退货单详情
	 * @param data
	 * @return
	 * @author silence
	 */
	Map<String, Object> getReportlossInfo(Map<String, Object> data);
	/**
	 * 退货单物料列表
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getReportlossMaterialList(Map<String, Object> data);
	/**
	 * 审核（修改）退货单
	 * @param data
	 * @return
	 * @author silence
	 */
	String updateReportlossOrder(Map<String,Object> data);
	
	/**
	 * 查询用料 （已处理）
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getMaterialOrderByDate(Map<String,Object> data);
	/**
	 * 查询用料 （已处理）数量
	 * @param data
	 * @return
	 * @author silence
	 */
	int getMaterialOrderByDateNum(Map<String, Object> data);
	
	/**
	 * 查询退货 （已处理）
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getReturnOrderByDate(Map<String,Object> data);
	/**
	 * 查询退货 （已处理）数量
	 * @param data
	 * @return
	 * @author silence
	 */
	int getReturnOrderByDateNum(Map<String, Object> data);
	
	/**
	 * 查询报损 （已处理）
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getReportlossOrderByDate(Map<String,Object> data);
	/**
	 * 查询报损 （已处理）数量
	 * @param data
	 * @return
	 * @author silence
	 */
	int getReportlossOrderByDateNum(Map<String, Object> data);
	/**
	 * 查询物料 库存 以及用料
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getMaterialGroupList(Map<String, Object> data);
	/**
	 * 查询库存物料明细
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getStockMaterialDetail(Map<String, Object> data);
	/**
	 * 查询库存 各种订单列表
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getStockOrderByStatistics(Map<String, Object> data);
	
}
