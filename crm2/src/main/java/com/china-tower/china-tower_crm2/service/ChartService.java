package com.china-tower.china-tower_crm2.service;

/**
 * 业绩报表服务层
 * @author 刘光岳 
 * @date 2019年7月2日
 */
public interface ChartService {
	/**
	 * 录入房源查询
	 */ 
	public void addHouseRecoder();
	
	
	/**
	 * 完成订单
	 */  
	public void ContractRecoder();
	
	/**
	 * 客户查询（自己的）
	 */ 
	public void addCustomerRecoder();
	
	/**
	 * 看房记录
	 */ 
	public void seeHouseRecoder(); 

}	
