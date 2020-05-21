package com.collection.service;

import java.util.List;
import java.util.Map;
/**
 * 公司相关
 * @author silence
 *
 */
public interface CompanyService {
	/**
	 * 公司信息
	 * @param data
	 * @return
	 * @author silence
	 */
	Map<String, Object> getCompanyInfo(Map<String, Object> data);
	void updatecompanyedition(Map<String,Object> map);
	
	/**
	 * 添加公司信息
	 * @param data
	 * @return
	 * @author silence
	 */
	void insertCompanyInfo(Map<String, Object> data);
	/**
	 * 修改公司信息
	 * @param data
	 * @return
	 * @author silence
	 */
	void updateCompany(Map<String, Object> data);
	
	/**
	 * 查询该手机号 所有的公司
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getCompanyListByPhone(Map<String, Object> data);
	/**
	 * 查询日志
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getLogList(Map<String, Object> data);
	int getLogListNum(Map<String, Object> data);
	/**
	 * 查询日志插入的所有模块
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getLogModelList(Map<String, Object> data);
	/**
	 * 查询banner图片
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getBannerList(Map<String, Object> data);
	/**
	 * 修改banner
	 * @param data
	 * @return
	 * @author silence
	 */
	void updateBanner(Map<String, Object> data);
	/**
	 * 添加banner
	 * @param data
	 * @return
	 * @author silence
	 */
	void insertBanner(Map<String, Object> data);
	/**
	 * 删除营业执照
	 * @param data
	 * @return
	 * @author silence
	 */
	void deleteLicense(Map<String, Object> data);
	/**
	 * 添加营业执照
	 * @param data
	 * @return
	 * @author silence
	 */
	void insertLicense(Map<String, Object> data);
	/**
	 * 添加使用方用户菜单表
	 * @param data
	 * @return
	 * @author silence
	 */
	void insertUserFunction(Map<String, Object> data);
	/**
	 * 查询所有公司列表
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getAllCompanyList(Map<String, Object> data);
	int getAllCompanyListNum(Map<String, Object> data);
	/**
	 * 查询公司权限列表
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getPowerByCompany(Map<String, Object> data);
	/**
	 * 修改公司权限
	 * @param data
	 * @return
	 * @author silence
	 */
	void updateCompanyPower(Map<String, Object> data);
	/**
	 * 公司统计
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getCompanyStatistics(Map<String, Object> data);
	/**
	 * 查询红黑榜
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getCompanyBlackList(Map<String, Object> data);
	/**
	 * 查询红黑榜数量
	 * @param data
	 * @return
	 * @author silence
	 */
	int getCompanyBlackListNum(Map<String, Object> data);
	
	/**
	 * 新增公司统计
	 * @param data
	 * @return
	 * @author silence
	 */
	List<Map<String, Object>> getNewCompanyStatistics(Map<String, Object> data);
	/**
	 * 获取公司最大的datacode
	 * @param data
	 * @return
	 * @author silence
	 */
	String getMaxCompanyDataCode();
	/**
	 * 添加组织
	 * @param data
	 * @return
	 * @author silence
	 */
	void insertOrganize(Map<String, Object> data);
	/**
	 * 添加用户组织
	 * @param data
	 * @return
	 * @author silence
	 */
	void insertOrganizeUser(Map<String, Object> data);
	/**
	 * 添加组织
	 * @param data
	 * @return
	 * @author silence
	 */
	void insertOrganizeMap(Map<String, Object> data);
	
	/**
	 * 查询组织架构的上下级是否存在店面
	 * @param map
	 * @return
	 */
	int getOrganizeStoreIsExsits(Map<String,Object> map);
	
	/**
	 * 查询某组织机构下面 最大的排序值
	 * @param map
	 * @return
	 */
	int getOrganizeMaxPriorityNum(Map<String,Object> map);
	
	/**
	 * 查询公司和创建者信息
	 * @param map
	 * @return
	 */
	Map<String,Object> getComapnyCreateUserInfo(Map<String,Object> map);
	
	/**
	 * 查询某组织上级的店面信息
	 * @param map
	 * @return
	 */
	Map<String,Object> queryUserUpIsExistsShop(Map<String,Object> map);
	
	/**
	 * 查询人员所属的组织架构
	 * @param map
	 * @return
	 */
	List<Map<String,Object>> getUserShops(Map<String,Object> map);
	
	/**
	 * 查询某公司已使用的总人数
	 * @param map
	 * @return
	 */
	int getCompanyUsedUserNum(Map<String,Object> map);
	
	/**
	 * 查询公司信息的活跃信息
	 * @param map
	 * @return
	 */
	List<Map<String,Object>> getAllComapnyListByPage(Map<String,Object> map);
}
