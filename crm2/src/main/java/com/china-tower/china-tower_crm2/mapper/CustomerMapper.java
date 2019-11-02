package com.china-tower.china-tower_crm2.mapper;

import com.china-tower.china-tower_crm2.model.Customer;

/**
 * 客户管理数据层
 * @author 刘光岳 
 * @date 2019年7月2日
 */
public interface CustomerMapper {
	
	/**
	 * 添加用户
	 * @param customer
	 */
	public void addCustomer(Customer customer);
	
	/**
	 * 编辑用户
	 * @param customer
	 */
	public void editCustomer(Customer customer);
	
	/**
	 * 拉黑
	 */
	public void blackList(); 
	
}
