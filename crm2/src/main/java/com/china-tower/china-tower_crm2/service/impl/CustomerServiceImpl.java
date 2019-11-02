package com.china-tower.china-tower_crm2.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.china-tower.china-tower_crm2.model.Customer;
import com.china-tower.china-tower_crm2.mapper.CustomerMapper;

/**
 * �ͻ���������ʵ����
 * 
 * @author ������
 * @date 2019��7��2��
 */
public class CustomerServiceImpl implements CustomerMapper {

	@Autowired
	private CustomerMapper customerMapper;

	public void setCustomerMapper(CustomerMapper customerMapper) {
		this.customerMapper = customerMapper;
	}

	@Override
	public void addCustomer(Customer customer) {
		customerMapper.addCustomer(customer);

	}

	@Override
	public void editCustomer(Customer customer) {
		customerMapper.editCustomer(customer);

	}

	@Override
	public void blackList() {
		customerMapper.blackList();

	}

}
