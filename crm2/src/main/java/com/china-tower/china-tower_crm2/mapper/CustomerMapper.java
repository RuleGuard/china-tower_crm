package com.china-tower.china-tower_crm2.mapper;

import com.china-tower.china-tower_crm2.model.Customer;

/**
 * �ͻ��������ݲ�
 * @author ������ 
 * @date 2019��7��2��
 */
public interface CustomerMapper {
	
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
