package com.china-tower.china-tower_crm2.service;

import com.china-tower.china-tower_crm2.model.Customer;

/**
 * 客户管理服务层
 * @author 刘光岳 
 * @date 2019年7月2日
 */
public interface CustomerService {
	
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
