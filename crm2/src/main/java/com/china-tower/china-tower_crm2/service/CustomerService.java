package com.china-tower.china-tower_crm2.service;

import com.china-tower.china-tower_crm2.model.Customer;

/**
 * �ͻ���������
 * @author ������ 
 * @date 2019��7��2��
 */
public interface CustomerService {
	
	/**
	 * ����û�
	 * @param customer
	 */
	public void addCustomer(Customer customer);
	
	/**
	 * �༭�û�
	 * @param customer
	 */
	public void editCustomer(Customer customer);
	
	/**
	 * ����
	 */
	public void blackList(); 
}
