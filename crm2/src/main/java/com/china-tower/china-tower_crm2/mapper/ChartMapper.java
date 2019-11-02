package com.china-tower.china-tower_crm2.mapper;

import org.apache.ibatis.annotations.Select;

/**
 * 业绩报表数据层
 * @author 刘光岳 
 * @date 2019年7月2日
 */
public interface ChartMapper {
	
	/**
	 * 录入房源查询
	 */
	@Select("select xxx from house where salesman={#user}  and time in xx")
	public void addHouseRecoder();
	
	
	/**
	 * 完成订单
	 */
	@Select("select xxx from  ")
	public void ContractRecoder();
	
	/**
	 * 客户查询（自己的）
	 */
	@Select("select xxx from  ")
	public void addCustomerRecoder();
	
	/**
	 * 看房记录
	 */
	@Select("select xxx from ")
	public void seeHouseRecoder();
	
}
